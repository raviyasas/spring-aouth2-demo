package com.app.springaouth2demo.service;

import com.app.springaouth2demo.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAllDepartments();

    Department addDepartment(Department department);

    Department findDepartment(Integer id);

    void deleteDepartment(Integer id);
}
