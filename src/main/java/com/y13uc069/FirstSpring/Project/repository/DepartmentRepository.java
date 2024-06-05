package com.y13uc069.FirstSpring.Project.repository;

import com.y13uc069.FirstSpring.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
