package com.abc.mortgage.dao;

import java.util.List;

import com.abc.mortgage.dao.models.UserAccount;

public interface UserAccountDao {

public	List<UserAccount> getUserAccounts(List<String> custIds);
}
