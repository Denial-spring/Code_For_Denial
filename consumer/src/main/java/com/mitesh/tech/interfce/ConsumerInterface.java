package com.mitesh.tech.interfce;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mitesh.tech.beans.User;

public interface ConsumerInterface {

	/*@RequestMapping(value="/users", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)

	public User saveUser(@RequestBody User user);
	*/
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUserDetails(@PathVariable int id);
	
	
}
