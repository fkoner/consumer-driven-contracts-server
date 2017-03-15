package mx.com.technogi.testing.services;

import mx.com.technogi.testing.domains.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account getById(String id) {
        return new Account(id, "friends", "tom@api.io");
    }
}
