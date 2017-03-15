package mx.com.technogi.testing.controller;

import mx.com.technogi.testing.domains.Account;
import mx.com.technogi.testing.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Carlos on 15/03/17.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Account getAccount(@PathVariable String id) {
        return accountService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/saludo/hello")
    public String getHello() {
        return "Hola";
    }
}
