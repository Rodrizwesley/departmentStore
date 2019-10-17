package com.wesley.departmentStore.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wesley.departmentStore.model.entities.Department;

@Repository
public interface DepartmentDao {

//	void insert(Department obj);
//	void update(Department obj);
//	void deleteById(Integer id);
//	Department findById(Integer id);
	List<Department> findAll();
}
