package com.wesley.departmentStore.model.dao;

import java.util.List;

import com.wesley.departmentStore.model.entities.Users;

public interface UsersDao {
	
	void insert(Users obj);
	void update(Users obj);
	void deleteById(Integer id);
	Users findById(Integer id);
	List<Users> findAll();

}
