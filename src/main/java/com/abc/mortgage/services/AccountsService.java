package com.abc.mortgage.services;

import java.util.HashMap;
import java.util.Map;

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

	Map<String,String> accountsCusids = new HashMap<>();
	{
		accountsCusids.put("9242423", "212345678");
		accountsCusids.put("9905243", "2123488778");
		accountsCusids.put("9821283", "4053490");
		accountsCusids.put("9787544", "354234234");
	}
	public Accounts getAccounts(String searchParam) {
		System.out.println(search);
		SolrSearchResponse solrResp = search.search(searchParam);
		return accountsMapper.accountsDataToResponseModel(solrResp, accountsCusids);
	}
}
