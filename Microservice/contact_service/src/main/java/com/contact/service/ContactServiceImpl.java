package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	
      Contact c1 = new Contact(1L,"ayush@gmail.com",101L,"Ayush");
	 
      Contact c2 = new Contact(2L,"amit@gmail.com",101L,"Amit");
      
      Contact c3 = new Contact(3L,"piyush@gmail.com",102L,"Piyush");
	  
	

	public List<Contact> getContactsOfUser(Long userId) {
		
		 List<Contact> list = new ArrayList<>();
		  list.add(c1);
		  list.add(c2);
		  list.add(c3);
		  return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
}
