package com.datamodeling.modeling.service;

import com.datamodeling.modeling.model.Department;

import java.util.List;

public interface IDepartment {
    Department create(Department department);
    List<Department> findAll();
    Department update (Long id, Department department);
    void delete(Long id);
}
