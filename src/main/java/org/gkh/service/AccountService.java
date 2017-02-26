package org.gkh.service;

import org.gkh.model.Account;
import org.gkh.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void save(Account account) {
        accountRepository.save(account);
    }
}
