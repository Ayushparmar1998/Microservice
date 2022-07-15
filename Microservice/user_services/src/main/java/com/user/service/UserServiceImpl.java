package com.user.service;



import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.user.entity.User;



@Service
public class UserServiceImpl implements UserService {

 
	
	 User u1 = new User(101L,"ayush","parmar");
	 
	 User u2 = new User(102L,"piyush","parmar");
	  
	
	

	@Override
	public User getUser(Long id) {
		 List<User> list = new ArrayList<>();
		  list.add(u1);
		  list.add(u2);
		return   list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	
	
	
	
}
