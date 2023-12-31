package co.istad.mbank.authorithies;


import co.istad.mbank.role.Role;
import co.istad.mbank.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authority")
public class AuthorityRestController {
    private final AuthorityRepository authorityRepository;

    @GetMapping
    public Iterable<Authority> findAll(){

        return authorityRepository.findAll();
    }
}
