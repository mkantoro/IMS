package pl.mkantorosinski.ims.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class User {

    public User(String login, String password, String email, String full_name, Date created_at, Date deleted_at, int status ,Role role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.full_name = full_name;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
        this.status = status;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false ,unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private Date created_at;


    private Date deleted_at;

    @Column(nullable = false)
    private int status;


    //@ManyToOne
    //@JoinColumn(name = "id")

    @ManyToOne
    @JoinColumn(name="role")
    private Role role;



}
