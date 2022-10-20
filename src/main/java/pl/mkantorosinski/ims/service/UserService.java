package pl.mkantorosinski.ims.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.repository.RoleRepository;
import pl.mkantorosinski.ims.repository.UserRepository;
import pl.mkantorosinski.ims.rest.dto.UserCreateDto;
import pl.mkantorosinski.ims.rest.dto.UserGetDto;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Transactional
    public void save( User user){
    userRepository.save(user);
   }

   public User find(long id){
        return userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("user not found")
        );
   }

   public void create(UserCreateDto user){
       User userToSave;
       userToSave = new User(user.getLogin(),user.getPassword(), user.getEmail(),user.getFull_name(), LocalDateTime.now(),1, user.getRole());
       userRepository.save(userToSave);

   }

}
