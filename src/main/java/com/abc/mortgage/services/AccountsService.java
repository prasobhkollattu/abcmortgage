package com.abc.mortgage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mortgage.contollers.mapper.AccountsMapper;
import com.abc.mortgage.services.models.SolrSearchResponse;
import com.abc.mortgagebanking.models.Accounts;

@Service
public class AccountsService {

	@Autowired
	private SolrSearch search;
	@Autowired
	private AccountsMapper accountsMapper;

	public Accounts getAccounts(String searchParam) {
		System.out.println(search);
		SolrSearchResponse solrResp = search.search(searchParam);
		return accountsMapper.accountsDataToResponseModel(solrResp, null);
	}
}
