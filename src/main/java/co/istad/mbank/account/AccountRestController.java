package co.istad.mbank.account;

import co.istad.mbank.user.User;
import co.istad.mbank.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accounts")
public class AccountRestController {
    private final AccountRepository accountRepository;
    @GetMapping
    public Iterable<Account>findAll(){
        return accountRepository.findAll();
    }
}
