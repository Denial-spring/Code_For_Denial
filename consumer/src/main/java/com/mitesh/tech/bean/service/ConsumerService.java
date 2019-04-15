package com.mitesh.tech.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mitesh.tech.beans.User;
import com.mitesh.tech.exceptions.UserNotFoundException;

@Service
public class ConsumerService {

	@Value("${consumerURL}")
	public String url;
	
	  @Autowired
	  RestTemplate restTemplate;
	
	/*public User saveUser(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}*/
	
	
	
	public User findOne(int id) throws Exception{
		ResponseEntity<User> response = restTemplate.getForEntity(url+id, User.class);		
		return response.getBody();
		
	}
}
	

