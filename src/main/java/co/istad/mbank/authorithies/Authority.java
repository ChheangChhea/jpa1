package co.istad.mbank.authorithies;


import co.istad.mbank.role.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    @ManyToMany(mappedBy = "authorities")
    private List<Role> roles;


}

