package pl.mkantorosinski.ims.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.repository.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role find(long id) {
        return roleRepository.findById(id).orElseThrow(
                () -> new RuntimeException("user not found")
        );
    }
}