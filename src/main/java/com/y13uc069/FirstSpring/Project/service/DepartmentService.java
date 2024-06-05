package com.y13uc069.FirstSpring.Project.service;

import com.y13uc069.FirstSpring.Project.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public Department getDepartmentByID(long id);

    List<Department> getDepartments();

    void deleteDepartmentById(long id);
}
