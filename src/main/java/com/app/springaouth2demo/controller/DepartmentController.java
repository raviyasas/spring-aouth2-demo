package com.app.springaouth2demo.controller;

import com.app.springaouth2demo.entities.Department;
import com.app.springaouth2demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department/allDepartments")
    public List<Department> getAllDepartments(){
        return departmentService.findAllDepartments();
    }

    @PostMapping("/department/addDepartment")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PostMapping("/department/{id}")
    public Department getDepartment(@RequestParam Integer id){
        return departmentService.findDepartment(id);
    }

    @PostMapping("department/remove/{id}")
    public void removeDepartment(@RequestParam Integer id){
        departmentService.deleteDepartment(id);
    }

}
