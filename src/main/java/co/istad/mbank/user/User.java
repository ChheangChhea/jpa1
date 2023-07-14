package co.istad.mbank.user;

import co.istad.mbank.account.Account;
import co.istad.mbank.role.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 50)
    private String username;


    private String gender;
    @Column(name = "one_signal_id", length = 50)
    private String oneSignalId;
    @Column(name = "is_deleted", length = 50)
    private Boolean isDeleted;
    @Column(name = "is_student", length = 50)
    private Boolean isStudent;
    @Column(name = "student_card_id", length = 50)
    private String studentCardId;
    private String email;
    private String password;
    @Column(name = "is_verify", length = 50)
    private Boolean isVerify;
    @Column(name = "verify_code", length = 50)
    private Boolean VerifyCode;
    @Column(name = "phone_number", length = 50)
    private String phoneNumber;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_registration",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id") )
    private List<Role> roles;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_accounts",
            joinColumns=@JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id") )
    private List<Account> accounts;
}
