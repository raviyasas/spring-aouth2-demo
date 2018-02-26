package com.app.springaouth2demo.service.Impl;

import com.app.springaouth2demo.entities.User;
import com.app.springaouth2demo.entities.dto.UserDto;
import com.app.springaouth2demo.repository.UserRepository;
import com.app.springaouth2demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getUsers() {
        return userRepository.findAll(new Sort("username"));
    }

    @Override
    public User addNewUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        return userRepository.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public void removeUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> findUserByDepartment(Integer depId) {
        return userRepository.findUsersByDepartment(depId);
    }
}
