package pl.mkantorosinski.ims.rest.mapper;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.rest.dto.UserGetDto;


public class UserMapper {

    public static UserGetDto toDto(User user) {
        return UserGetDto.builder()
                .login(user.getLogin())
                .email(user.getEmail())
                .full_name(user.getFull_name())
                .created_at(user.getCreated_at())
                .deleted_at(user.getDeleted_at())
                .status(user.getStatus())
                .role(RoleMapper.toDto(user.getRole()))
                .build();

    }
}