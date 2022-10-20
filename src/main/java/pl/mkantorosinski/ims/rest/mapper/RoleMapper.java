package pl.mkantorosinski.ims.rest.mapper;

import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.rest.dto.RoleGetDto;

public class RoleMapper {

    public static RoleGetDto toDto (Role role){
        return RoleGetDto.builder()
                .name(role.getName())
                .build();
    }

}
