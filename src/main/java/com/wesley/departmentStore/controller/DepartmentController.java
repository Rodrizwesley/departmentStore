package com.wesley.departmentStore.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wesley.departmentStore.model.entities.Department;
import com.wesley.departmentStore.service.DepartmentService;


@Controller
public class DepartmentController {
	
	@Lazy
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value= "/department", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> listAllDEpartment() throws UnsupportedEncodingException{
		
		Map<String, Object> retorno = new HashMap<String, Object>();
		List<Department> department = new ArrayList<Department>();
		
		try {
			department = departmentService.findAll();
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		
		retorno.put("response", department);
		
		return retorno;
	}

}
