package co.istad.mbank.user;

import co.istad.mbank.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User,Integer> {

}
