package com.mitesh.tech.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class SpringRestBean {

		private	String direction;
		private String property;
		private Boolean ignoreCase;
		private String nullHandling;
		private Boolean ascending;
		
		public int totalRec;

	
}
