package com.app.springaouth2demo.service;

import com.app.springaouth2demo.entities.OutputMessage;
import com.app.springaouth2demo.entities.dto.UserDto;
import com.app.springaouth2demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserExistService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

//    public void checkUser(String username, OutputMessage message, UserDto userDto) {
//
//        if(userRepository.findByUsername(username) != null){
//            message.setMessage("User already exists !");
//            message.setErrorCode(200);
//        }else{
//            userService.addNewUser(userDto, message);
//            message.setMessage("User created !");
//            message.setErrorCode(200);
//        }
//    }
}
