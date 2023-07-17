package co.istad.mbank.transaction;

import co.istad.mbank.accountTypes.AccountTypes;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
}
