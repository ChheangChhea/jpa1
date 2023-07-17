package co.istad.mbank.accountTypes;

import co.istad.mbank.account.Account;
import co.istad.mbank.role.Role;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account_types")
public class AccountTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;



//    @OneToMany(fetch = FetchType.LAZY)
//    private List<Account> accounts;

   /* @ToString.Exclude
   @ManyToMany
   @JoinColumn(name = "account_id",nullable = false)
    private List<Account> accounts;*/
}
