package org.gkh.controller;

import org.gkh.model.Account;
import org.gkh.model.Card;
import org.gkh.service.AccountService;
import org.gkh.service.EdisonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private EdisonDataService edisonDataService;

    @RequestMapping(value = "")
    public String getAccountPage(Model model) {
        model.addAttribute("watts", edisonDataService.getWatts());
        return "account";
    }

    @RequestMapping(value = "/create")
    @ResponseBody
    public String createUser() {
        List<Card> userCards = new ArrayList<>();
        userCards.add(new Card());
        Account account = new Account("user", "qwerty", userCards);
        accountService.save(account);
        return "Test account successfully created";
    }
}
