package co.istad.mbank;

import co.istad.mbank.role.Role;
import co.istad.mbank.role.RoleRepository;
import co.istad.mbank.user.User;
import co.istad.mbank.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//@RequiredArgsConstructor
public class MBankApplication  {
//    private final RoleRepository roleRepository;
//    private final UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(MBankApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        Role admin= Role.builder()
//                .name("ADMIN")
//                .build();
//
//        Role editor= Role.builder()
//                .name("EDITOR")
//                .build();
//
//        Role subscriber = Role.builder()
//                .name("SUBSCRIBER")
//                .build();
//
//        roleRepository.save(admin);
//        roleRepository.save(editor);
//        roleRepository.save(subscriber);
//
//
//        User user= User.builder()
//                .username("Chheangchhea")
//                .displayName("Chheang Chhea")
//                .biography("Hello")
//                .roles(List.of(admin))
//                .build();
//        userRepository.save(user);
//
//        User user2= User.builder()
//                .username("Chhea")
//                .displayName("Chhea chay")
//                .biography("Hello every you ")
//                .roles(List.of(admin,editor))
//                .build();
//        userRepository.save(user2);
//
//        Iterable <User> users=userRepository.findAll();
//        users.forEach(u-> {
//            System.out.println(u.getUsername());
//            System.out.println(u.getRoles().get(0).getName());
//        });


}
