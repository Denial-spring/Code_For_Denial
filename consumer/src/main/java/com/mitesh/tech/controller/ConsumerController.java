package com.mitesh.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mitesh.tech.bean.service.ConsumerService;
import com.mitesh.tech.beans.User;
import com.mitesh.tech.exceptions.UserNotFoundException;
import com.mitesh.tech.interfce.ConsumerInterface;

@RestController
public class ConsumerController implements ConsumerInterface{

	@Autowired
	private ConsumerService services;
	
	/*@Override
	public User saveUser(@RequestBody User user){
		return services.saveUser(user);
	}
*/
	
	
	@Override
	public User getUserDetails(@PathVariable int id) {
		try {
			return services.findOne(id);
		}catch(Exception ex) {
			throw new UserNotFoundException("Cunsumer URL is not working for Id "+id);	
		}
	}
	
}
