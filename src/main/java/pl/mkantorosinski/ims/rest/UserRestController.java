package pl.mkantorosinski.ims.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.service.UserService;

import java.util.Map;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserRestController {
    //localhost:8080/user

    private final UserService userService;

//    @GetMapping("/{id}")
//    public User find(@PathVariable("id") long id){
//    return userService.save(user);
//    }

    @PostMapping
    public Map<User, Role> create(@RequestBody User user, @RequestBody Role role){
    return userService.create(user, role);
    }

}
