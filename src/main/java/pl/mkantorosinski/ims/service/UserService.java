package pl.mkantorosinski.ims.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.repository.RoleRepository;
import pl.mkantorosinski.ims.repository.UserRepository;

import java.util.List;
import java.util.Map;

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

   public Map<User,Role> create(User user, Role role){
        userWithRole = userRepository.saveAll(user, role);
       return userWithRole;
   }
}
