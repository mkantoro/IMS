package pl.mkantorosinski.ims.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class User {

    public User(String login, String password, String email, String full_name, LocalDateTime created_at, LocalDateTime deleted_at, int status ,Role role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.full_name = full_name;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
        this.status = status;
        this.role = role;
    }

    public User(String login, String password, String email, String full_name, LocalDateTime created_at, int status ,Role role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.full_name = full_name;
        this.created_at = created_at;
        this.status = status;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false ,unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private LocalDateTime created_at;


    private LocalDateTime deleted_at;

    @Column(nullable = false)
    private int status;


    //@ManyToOne
    //@JoinColumn(name = "id")

    @ManyToOne
    @JoinColumn(name="role")
    private Role role;



}
