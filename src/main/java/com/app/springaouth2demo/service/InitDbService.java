package com.app.springaouth2demo.service;

import com.app.springaouth2demo.entities.Department;
import com.app.springaouth2demo.entities.Role;
import com.app.springaouth2demo.entities.User;
import com.app.springaouth2demo.repository.DepartmentRepository;
import com.app.springaouth2demo.repository.RoleRepository;
import com.app.springaouth2demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class InitDbService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostConstruct
    public void addUsers(){

        //Add new roles
        Role roleAdmin = new Role();
        roleAdmin.setRoleName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);

        Role roleUser = new Role();
        roleUser.setRoleName("ROLE_USER");
        roleRepository.save(roleUser);

        //Add departments
        Department department1 = new Department();
        department1.setDepartmentName("Account");
        department1.setDepartmentSize(20);
        departmentRepository.save(department1);

        Department department2 = new Department();
        department2.setDepartmentName("Agri");
        department2.setDepartmentSize(50);
        departmentRepository.save(department2);

        Department department3 = new Department();
        department3.setDepartmentName("Transport");
        department3.setDepartmentSize(10);
        departmentRepository.save(department3);

        //Add user 1
        User user = new User();
        user.setFirstName("Ravi");
        user.setUsername("ryj");
        user.setPassword("123");
        user.setEmail("raviyasas@live.com");
        user.setDepartment(department1);

        List<Role> roles = new ArrayList<>();
        roles.add(roleAdmin);
        roles.add(roleUser);

        user.setRoles(roles);
        userRepository.save(user);

        //Add user 2
        User user2 = new User();
        user2.setFirstName("John");
        user2.setUsername("jn");
        user2.setPassword("123");
        user2.setEmail("john@live.com");
        user2.setDepartment(department2);

        List<Role> roles2 = new ArrayList<>();
        roles2.add(roleUser);

        user2.setRoles(roles2);
        userRepository.save(user2);

        //Add user 3
        User user3 = new User();
        user3.setFirstName("Ann");
        user3.setUsername("ann");
        user3.setPassword("111");
        user3.setEmail("ann@live.com");
        user3.setDepartment(department2);

        List<Role> roles3 = new ArrayList<>();
        roles3.add(roleUser);

        user3.setRoles(roles3);
        userRepository.save(user3);
    }
}
