package com.wesley.departmentStore.model.dao;

import java.util.List;

import com.wesley.departmentStore.model.entities.Roles;

public interface RolesDao {

	void insert(Roles obj);
	void update(Roles obj);
	void deleteById(Integer id);
	Roles findById(Integer id);
	List<Roles> findAll();
}
