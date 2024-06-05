package com.y13uc069.FirstSpring.Project.service;

import com.y13uc069.FirstSpring.Project.entity.Department;
import com.y13uc069.FirstSpring.Project.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentByID(long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(long id, Department department) {
        Department departmentFromDB = departmentRepository.findById(id).get();
        if (department.getDepartmentName() != null && !department.getDepartmentName().isEmpty()) {
            departmentFromDB.setDepartmentName(department.getDepartmentName());
        }
        if (department.getDepartmentCode() != null && !department.getDepartmentCode().isEmpty()) {
            departmentFromDB.setDepartmentName(department.getDepartmentCode());
        }
        if (department.getDepartmentAddress() != null && !department.getDepartmentAddress().isEmpty()) {
            departmentFromDB.setDepartmentName(department.getDepartmentAddress());
        }
        return departmentRepository.save(departmentFromDB);
    }
}
