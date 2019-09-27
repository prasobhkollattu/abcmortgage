package com.abc.mortgage.contollers.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abc.mortgagebanking.models.Account;
import com.abc.mortgagebanking.models.Accounts;

@Service
public class AccountsMapper {
	public Accounts accountsDataToResponseModel(List<AccountsSearch> acountsSearch,
			Map<String, String> accountsCustomerIds) {
		Accounts accounts = new Accounts();

		if (Optional.ofNullable(acountsSearch).isPresent()) {
			acountsSearch.stream().forEach(search -> {
				Account account = new Account();

				account.setAcountNumber("");
				account.setAcountType("");
				account.setAvailableBalance("");
				account.setCustomerId("");
				account.setCustomerName("");
				account.setDob("");
				account.setGender("");
				account.setLastTransactionDate("");
				account.setMortgages(null);
				accounts.getAccounts().add(account);

			});
		}

		return accounts;

	}
}
