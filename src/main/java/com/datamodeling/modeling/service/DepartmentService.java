package com.datamodeling.modeling.service;

import com.datamodeling.modeling.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartment{

    @Override
    public Department create(Department department) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }

    @Override
    public Department update(Long id, Department department) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
