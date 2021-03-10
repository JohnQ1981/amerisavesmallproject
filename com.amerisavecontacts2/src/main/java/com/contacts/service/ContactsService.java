package com.contacts.service;

import java.util.List;

import com.contacts.entity.Contacts;

public interface ContactsService  {
	
	Contacts saveContacts(Contacts contacts);
	
	Contacts updateContacts(Contacts contacts);
	
	void deleteContacts(Contacts contacts);
	
	Contacts getContactsById(int id);
	
	List<Contacts> getAllContacts();
	

}
