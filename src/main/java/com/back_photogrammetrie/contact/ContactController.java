package com.back_photogrammetrie.contact;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	private final ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@GetMapping
	public List<Contact> allContacts() {
		return contactService.allContacts();
	}
	
	@PostMapping
	@CrossOrigin("https://photogrammetrie-front.herokuapp.com")
	public Contact addContact(@RequestBody Contact newContact) {
		return contactService.addContact(newContact);
	}
	
	@DeleteMapping("{messageId}")
    public void getUser(@PathVariable("messageId") int messageId) {
    	if(contactService.allContacts().get(messageId)!=null) {
    		contactService.allContacts().remove(messageId);
    	}
    }
}
