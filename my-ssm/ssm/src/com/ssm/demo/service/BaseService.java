package com.ssm.demo.service;

import java.util.List;

import com.ssm.demo.model.Add;

public interface BaseService {
	String addInfo(Add addInfo);
	
	List<Add> getAll();
	
	String delete(String id);
	
	Add findById(String id);
	
	String update(Add addInfo);
}
