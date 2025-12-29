package com.datamodeling.modeling.controller;

import com.datamodeling.modeling.model.Department;
import com.datamodeling.modeling.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService _departmentService;

    public DepartmentController(DepartmentService departmentService){
        this._departmentService = departmentService;
    }

    @PostMapping
    public Department create(@RequestBody Department department){
        return _departmentService.create(department);
    }

    @GetMapping
    public List<Department> getAll(){
        return _departmentService.findAll();
    }

    @GetMapping("/{id}")
    public String getDepartment(Long id){
//        return _departmentService.findAll();
        return "id 1";
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department department){
        return _departmentService.update(id,department);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
         _departmentService.delete(id);
         return "Delete Successfully";
    }
}
