package co.istad.mbank.accountTypes;

import co.istad.mbank.account.Account;
import co.istad.mbank.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accountTypes")
public class AccountTypesRestController {
    private final AccountTypeRepository accountTypeRepository;
    @GetMapping
    public Iterable<AccountTypes> findAll(){

        return accountTypeRepository.findAll();
    }
}

