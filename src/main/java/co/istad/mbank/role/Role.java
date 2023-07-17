package co.istad.mbank.role;


import co.istad.mbank.authorithies.Authority;
import co.istad.mbank.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

//    @ToString.Exclude
//    @JsonBackReference
//    @ManyToMany (mappedBy = "roles")
//    private List<User> users;

  /*  @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles_authorities",
            joinColumns=@JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id") )
    private List<Authority> authorities;*/
  @ManyToMany
  private List<Authority> authorities;

}

