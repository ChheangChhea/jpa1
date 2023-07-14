package co.istad.mbank.authorithies;

import co.istad.mbank.role.Role;
import co.istad.mbank.role.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/authority")
public class AuthorityRestController {
    private final RoleRepository roleRepository;
    @GetMapping
    public Iterable<Role>findAll(){
        return roleRepository.findAll();
    }
}
