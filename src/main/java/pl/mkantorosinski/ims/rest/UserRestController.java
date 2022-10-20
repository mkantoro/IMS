package pl.mkantorosinski.ims.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.datasource.UserCredentialsDataSourceAdapter;
import org.springframework.web.bind.annotation.*;
import pl.mkantorosinski.ims.entity.Role;
import pl.mkantorosinski.ims.entity.User;
import pl.mkantorosinski.ims.rest.dto.UserCreateDto;
import pl.mkantorosinski.ims.rest.dto.UserGetDto;
import pl.mkantorosinski.ims.service.UserService;

import java.util.Map;

import static pl.mkantorosinski.ims.rest.mapper.UserMapper.toDto;

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
    public void create(@RequestBody UserCreateDto user){
     userService.create(user);
    }

    @GetMapping("/{id}")
    public UserGetDto find(@PathVariable("id") long id)
    {
       return toDto(userService.find(id));
    }

}
