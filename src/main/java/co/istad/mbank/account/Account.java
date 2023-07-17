package co.istad.mbank.account;

import co.istad.mbank.accountTypes.AccountTypes;
import co.istad.mbank.transaction.Transaction;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = " account_no")
    private String accountNo;
    @Column(name = " account_name")
    private String accountName;
    private Integer pin;
    @Column(name = " transfer_limit")
    private Integer transferLimit;
    @Column(name = " account_type")
    private Integer accountType;


 /*   @ToString.Exclude
    @JsonBackReference
    @ManyToMany
    @JoinColumn(name = "account_id")
    private List<AccountTypes> accountTypes;*/


//    Account Types
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn
 private AccountTypes accountTypes;




}
