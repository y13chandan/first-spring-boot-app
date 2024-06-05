package com.y13uc069.FirstSpring.Project.controller;

import com.y13uc069.FirstSpring.Project.entity.Department;
import com.y13uc069.FirstSpring.Project.service.DepartmentService;
import com.y13uc069.FirstSpring.Project.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentByID(@PathVariable("id") long id) {
        return departmentService.getDepartmentByID(id);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return departmentService.getDepartments();
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long id) {
        departmentService.deleteDepartmentById(id);
        return String.format("Department with id = %2d deleted", id);
    }
}
