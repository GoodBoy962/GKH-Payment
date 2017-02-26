package org.gkh.controller;

import org.gkh.model.Account;
import org.gkh.repository.AccountRepository;
import org.gkh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/gkh/v1/public/accounts/{accountId}")
    public String getPublicAccountDataLinkedTo(@PathVariable final Long accountId) {
        accountService.save(new Account("user", "qwerty"));
        return "Public account linked to :" + accountId;
    }

    @RequestMapping(value = "/ghk/v1/private/accounts/{accountId}")
    public String getPrivateAccountDataLinkedTo(@PathVariable final Long accountId) {
        return "Private account linked to :" + accountId;
    }

}
