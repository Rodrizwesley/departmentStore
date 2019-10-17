package com.wesley.departmentStore.model.dao.Impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wesley.departmentStore.model.dao.DepartmentDao;
import com.wesley.departmentStore.model.entities.Department;

public interface DepartmentDaoImpl extends JpaRepository<Department, Long>, DepartmentDao {
	

	@Override
	@Query("SELECT * FROM departments ORDER BY idDepartment")
	List<Department> findAll();
	
}
