package com.app.springaouth2demo.service.Impl;

import com.app.springaouth2demo.entities.Department;
import com.app.springaouth2demo.repository.DepartmentRepository;
import com.app.springaouth2demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll(new Sort("departmentName"));
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartment(Integer id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepository.delete(id);
    }
}
