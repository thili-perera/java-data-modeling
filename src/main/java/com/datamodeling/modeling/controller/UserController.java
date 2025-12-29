package com.datamodeling.modeling.controller;

import com.datamodeling.modeling.model.User;
import com.datamodeling.modeling.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService _userService;

    public UserController(UserService userService){
        this._userService = userService;
    }

    @PostMapping
    public User create (@Valid @RequestBody User user){
        return _userService.create(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return _userService.getById(id);
    }

    @GetMapping
    public List<User> getAll(){
        return _userService.getAll();
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @Valid @RequestBody User user){
        return _userService.update(id,user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return _userService.delete(id);
    }
}
