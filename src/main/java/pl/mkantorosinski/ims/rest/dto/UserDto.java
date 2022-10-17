package pl.mkantorosinski.ims.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.mkantorosinski.ims.entity.Role;


import java.util.Date;
@Getter
@Builder
public class UserDto {


    private long id;

    private String login;

    private String email;

    private String full_name;

    private Date created_at;

    private Date deleted_at;

    private int status;

    private Role role;
}
