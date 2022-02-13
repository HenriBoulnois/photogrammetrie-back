package com.back_photogrammetrie.contact;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ContactService {
	private final ContactRepository contactRepository;

	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

	public List<Contact> allContacts() {
		return contactRepository.findAll();
	}

	public Contact addContact(Contact newContact) {
		for(Contact c : contactRepository.findAll()) {
			if(c.getEmail().equals(newContact.getEmail())) {
				if(!c.isEsttraite()) {
					System.out.println("new"+newContact.getEmail()+"c"+c.getEmail());
					throw new IllegalArgumentException("Email déjà présent");
				}
			}
		}
		return contactRepository.save(newContact);		
	}
	
	public void deleteContact(int messageId) {
		List<Contact> listeContacts = contactRepository.findAll();
		for (Contact contact : listeContacts) {
			if(contact.getId()==messageId) {
				contactRepository.delete(contact);
			}
		}
	}
}
