package com.app.springaouth2demo.controller;

import com.app.springaouth2demo.entities.User;
import com.app.springaouth2demo.entities.dto.UserDto;
import com.app.springaouth2demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public User createNewUser(@RequestBody UserDto userDto){
        return userService.addNewUser(userDto);
    }

    @GetMapping("/user/allUsers")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @GetMapping("/user/remove/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.removeUser(id);
    }

    @GetMapping("/user/department/users/{depId}")
    public List<User> findUserByDepId(@PathVariable Integer depId){
        return userService.findUserByDepartment(depId);
    }
}
