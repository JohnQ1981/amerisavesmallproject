package com.contacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.entity.Contacts;
import com.contacts.repository.ContactsRepository;
@Service
public class ContactsServiceImpl implements ContactsService {

	@Autowired
	private ContactsRepository repo;
	
	@Override
	public Contacts saveContacts(Contacts contacts) {
		
		return repo.save(contacts);
	}

	@Override
	public Contacts updateContacts(Contacts contacts) {
		
		return repo.save(contacts);
	}

	@Override
	public void deleteContacts(Contacts contacts) {
		repo.delete(contacts);

	}

	@Override
	public Contacts getContactsById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Contacts> getAllContacts() {
		
		return repo.findAll();
	}

	

}
