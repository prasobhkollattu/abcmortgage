package com.abc.mortgage.contollers.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abc.mortgage.services.models.SolrSearchResponse;
import com.abc.mortgagebanking.models.Account;
import com.abc.mortgagebanking.models.Accounts;

@Service
public class AccountsMapper {
	public Accounts accountsDataToResponseModel(SolrSearchResponse solrSearchResponse,
			Map<String, String> accountsCustomerIds) {
		Accounts accounts = new Accounts();
		List<Account> accountList = new ArrayList<>();
		if (Optional.ofNullable(solrSearchResponse).isPresent()) {
			solrSearchResponse.getResponse().getDocs().stream().forEach(doc -> {
				Account account = new Account();

				account.setAcountNumber("");
				account.setAcountType("");
				account.setAvailableBalance("");
				account.setCustomerId(String.valueOf(doc.getCustomerNumber().get(0)));
				account.setCustomerName(doc.getFirstName().get(0) + " " + doc.getName().get(0));
				account.setDob(doc.getBirthDate().get(0));
				account.setGender("");
				account.setLastTransactionDate("");
				account.setMortgages(null);
				accountList.add(account);

			});

			accounts.accounts(accountList);
		}

		return accounts;

	}
}
