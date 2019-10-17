package com.wesley.departmentStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wesley.departmentStore.model.dao.DepartmentDao;
import com.wesley.departmentStore.model.entities.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao dao;

	@Override
	public List<Department> findAll() throws Exception {
		return dao.findAll();
	}
}
