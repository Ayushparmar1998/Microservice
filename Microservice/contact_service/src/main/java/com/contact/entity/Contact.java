package com.contact.entity;

public class Contact { 
	
	
	private Long cId;
	private String email;
	private Long userId;
	private String contactName;
	
	public Contact() {}
	
	public Contact(Long cId, String email, Long userId, String contactName) {
		super();
		this.cId = cId;
		this.email = email;
		this.userId = userId;
		this.contactName = contactName;
	}
	
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
}
