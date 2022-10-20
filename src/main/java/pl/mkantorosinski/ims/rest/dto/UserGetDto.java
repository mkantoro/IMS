package pl.mkantorosinski.ims.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.mkantorosinski.ims.entity.Role;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
public class UserGetDto {


    private String login;


    private String email;


    private String full_name;


    private LocalDateTime created_at;


    private LocalDateTime deleted_at;


    private int status;


    private RoleGetDto role;
}
