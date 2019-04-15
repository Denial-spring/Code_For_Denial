package com.mitesh.tech.body;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.mitesh.tech.bean.SpringRestBean;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
public class RequestBodySaveMyObj {

	private List<SpringRestBean> objectList;
	
	public List<SpringRestBean> getObjectList(){
			return objectList;
	}

}
