package com.mitesh.tech.interfce;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mitesh.tech.bean.User;
import com.mitesh.tech.body.RequestBodySaveMyObj;

public interface SpringRestInterface {

	@RequestMapping(value="/saveMyObject", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,
								consumes=MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<?> saveMyObj(@RequestBody RequestBodySaveMyObj jsonObj,
					@RequestHeader int recordCount,@RequestHeader int id) throws Exception;

	
	
	@RequestMapping(value="/users", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)

	public User saveUser(@RequestBody User user);
	
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getUser();
	

	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUserDetails(@PathVariable int id);
	
}
