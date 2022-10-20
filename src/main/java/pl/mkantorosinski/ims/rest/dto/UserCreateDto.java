package pl.mkantorosinski.ims.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.mkantorosinski.ims.entity.Role;


import java.awt.*;
import java.util.Date;

@Getter
@Builder
public class UserCreateDto {


    private String login;

    private String email;

    private String full_name;

    private String password;

    private Role role;
}
