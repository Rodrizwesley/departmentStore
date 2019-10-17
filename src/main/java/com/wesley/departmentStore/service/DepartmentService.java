package com.wesley.departmentStore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wesley.departmentStore.model.entities.Department;

@Service
public interface DepartmentService {
	
	List<Department> findAll() throws Exception;

}
