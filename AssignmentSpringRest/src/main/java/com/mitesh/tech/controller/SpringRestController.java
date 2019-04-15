package com.mitesh.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.mitesh.tech.SpringRestService;
import com.mitesh.tech.bean.SpringRestBean;
import com.mitesh.tech.bean.User;
import com.mitesh.tech.body.RequestBodySaveMyObj;
import com.mitesh.tech.exceptions.UserNotFoundException;
import com.mitesh.tech.interfce.SpringRestInterface;

@RestController
public class SpringRestController implements SpringRestInterface{
	
	
	@Autowired
	private SpringRestService services;
	
	@Override
	public ResponseEntity<?> saveMyObj(@RequestBody RequestBodySaveMyObj jsonObj,
			@RequestHeader("recordCount") int recordCount,
			@RequestHeader("id") int id) throws Exception{
			
	System.out.println("Your Record Count is "+recordCount);
	System.out.println("Your Id is "+id);
	
		
		 ResponseEntity<List<SpringRestBean>> body = ResponseEntity.ok().body(services.saveObj(jsonObj.getObjectList()));
		
		 return body;
	}
	
	@Override
	public User saveUser(@RequestBody User user){
		return services.saveUser(user);
	}

	@Override
	public List<User> getUser() {
		return services.findAll();
	}
	
	@Override
	public User getUserDetails(@PathVariable int id) {
		User user = services.findOne(id);
		
		if(user==null)
			throw new UserNotFoundException("User is not found for Id "+id);
		return user;
		
	}
	
	
}
