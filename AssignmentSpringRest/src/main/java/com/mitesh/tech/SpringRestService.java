package com.mitesh.tech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitesh.tech.bean.SpringRestBean;
import com.mitesh.tech.bean.User;

@Service
public class SpringRestService {

	@Autowired
	SpringRestBean bean;
	
	private static List<User> users=new ArrayList<>();
	
	public static int usersCount=3;
	
	public static int recordCounts=0;
	static {
		users.add(new User(1, "Adam", "New York"));
		users.add(new User(2, "Jack", "Mumbai"));
		users.add(new User(3, "Peter", "New Jersey"));
	}
	
	
	public List<SpringRestBean> saveObj(List<SpringRestBean> lst) {
		List<SpringRestBean> listUpdated = new ArrayList<>(); 
		
		for(SpringRestBean bean : lst) {
			
			bean.setDirection(bean.getDirection().replace("A",""));
			
			listUpdated.add(bean);
			bean.setTotalRec(++recordCounts);
			System.out.println(bean.getTotalRec());
		}
		
	return listUpdated;	
	}

	
	
	public User saveUser(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	
	public List<User> findAll(){
		return users;
	}
	
	public User findOne(int id){
		for(User user:users) {
			if(user.getId()==id) {
				return user;	
			}
		}
		return null;
	}
	
	
}


