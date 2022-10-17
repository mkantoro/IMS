package pl.mkantorosinski.ims.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @Column(unique = true)
    private long id;
    private String name;

    @OneToMany(mappedBy = "role")
   // @JoinColumn(name="id")
    private List<User> users;

}
