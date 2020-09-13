package com.ashokit.service;

import java.util.List;

import com.ashokit.dao.Contact;
import com.nt.dto.ContactDTO;

public interface ContactService {

	public boolean saveContact(Contact dto);

	public List<ContactDTO> getAllContacts();
	
	public ContactDTO getContactById(Integer cid);
	
	public boolean updatContact(ContactDTO dto);
	
	public boolean deleteContact(Integer cid);

	
}
