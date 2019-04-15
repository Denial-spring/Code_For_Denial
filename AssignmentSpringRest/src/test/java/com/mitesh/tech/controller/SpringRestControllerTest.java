package com.mitesh.tech.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class SpringRestControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void saveMyObj() throws Exception {
	
		//Call "/dummy-item"		
		RequestBuilder request=MockMvcRequestBuilders.get("/users/1").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
							.andExpect(content().string("{\"id\":1,\"name\":\"ball\",\"price\":10,\"quantity\":5}"))
							.andExpect((ResultMatcher) header("recordCount", "2"))
							.andExpect((ResultMatcher) header("id", "35"))
							.andReturn();
		
		
		
		//verify the result Item Object
		assertEquals("{\"id\":1,\"name\":\"ball\",\"price\":10,\"quantity\":5}", result.getResponse().getContentAsString());
	}
	
	
}
