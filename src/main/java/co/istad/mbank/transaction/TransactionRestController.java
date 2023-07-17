package co.istad.mbank.transaction;

import co.istad.mbank.accountTypes.AccountTypes;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transactions")
public class TransactionRestController {
    private final TransactionRepository transactionRepository;
    @GetMapping


    public Iterable< Transaction > findAll(){

        return transactionRepository.findAll();
    }
}
