package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.contacts.entity.Contacts;
import com.contacts.service.ContactsService;

@Controller
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@RequestMapping("/createContact")
	public String createContact() {
		return "createContact";
	}
	
	@RequestMapping ("/saveContact")
	public String savecontact(@ModelAttribute("contacts")Contacts contact, ModelMap modelMap) {
		Contacts contactSaved =service.saveContacts(contact);
		String msg="You saved contact successfully by Id"+ contactSaved.getId();
		modelMap.addAttribute(msg);
		return "createContact";
	}
	@RequestMapping("/displayContacts")
	public String displaycontacts(ModelMap modelMap) {
		List<Contacts> allcontacts = service.getAllContacts();
		modelMap.addAttribute("contacts",allcontacts);
		return "displayContacts";		
	}
	@RequestMapping("/deleteContact")
	public String deletecontact(@RequestParam("id") int id, ModelMap modelMap) {
		Contacts contactsById = service.getContactsById(id);
		service.deleteContacts(contactsById);
		List<Contacts> allcontacts = service.getAllContacts();
		modelMap.addAttribute("contacts",allcontacts);
		return "displayContacts";
		
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Contacts updatecontactById = service.getContactsById(id);
		modelMap.addAttribute("contacts",updatecontactById);
		return "editContacts";
				
	}
	@RequestMapping("/editContacts")
	public String editcontact(@ModelAttribute("contacts") Contacts contact, ModelMap modelMap) {
		
		service.updateContacts(contact);
		
		List<Contacts> allcontacts = service.getAllContacts();
		modelMap.addAttribute("contacts",allcontacts);
		return "displayContacts";
	}
	
	
	
	
	
	
}
