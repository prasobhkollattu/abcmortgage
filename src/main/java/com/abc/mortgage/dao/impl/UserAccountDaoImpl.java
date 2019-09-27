package com.abc.mortgage.dao.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.mortgage.dao.models.UserAccount;

@Repository
public interface UserAccountDaoImpl extends CrudRepository<UserAccount, Integer> {

}
