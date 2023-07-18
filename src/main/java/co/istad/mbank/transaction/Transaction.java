package co.istad.mbank.transaction;

import co.istad.mbank.account.Account;
import co.istad.mbank.accountTypes.AccountTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "sender_account_id")
    private Integer senderAccountId;
    @Column(name = "receiver_accountId")
    private Integer receiverAccountId;
    private Double amount;
    private String remark;
    @Column(name = "is_payment")
    private String isPayment;
    @Column(name = "payment_id")
    private Integer paymentId;
    @Column(name = "phone_number")
    private Integer phoneNumber;
    @Column(name = "transfered_at")
    private LocalDateTime transferedAt;

    // Transition
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

}
