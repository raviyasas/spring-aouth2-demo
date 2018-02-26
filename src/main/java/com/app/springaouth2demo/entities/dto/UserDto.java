package com.app.springaouth2demo.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable{

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private Date createdDate;
    private String username;
    private String password;

}
