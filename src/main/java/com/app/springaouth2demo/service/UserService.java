package com.app.springaouth2demo.service;

import com.app.springaouth2demo.entities.OutputMessage;
import com.app.springaouth2demo.entities.User;
import com.app.springaouth2demo.entities.dto.UserDto;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User addNewUser(UserDto userDto);

    User findByUserName(String userName);

    User findUserById(Long userId);

    void removeUser(Long id);

    List<User> findUserByDepartment(Integer depId);
}
