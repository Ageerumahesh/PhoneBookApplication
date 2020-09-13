package com.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.Contact;
import com.ashokit.dao.ContactDtlsEntity;
import com.ashokit.dao.ContactDtlsRepository;
import com.nt.dto.ContactDTO;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactDtlsRepository cntctDtlsRepo;


	@Override ////this method is save to contat dtls in db s/w
	public boolean saveContact(Contact cntct) {

		ContactDtlsEntity entityObj = null, savedEntityObj = null;
		
		entityObj = new ContactDtlsEntity();
		BeanUtils.copyProperties(cntct, entityObj);
		savedEntityObj = cntctDtlsRepo.save(entityObj);

		return savedEntityObj.getCid() != null;
	}

	@Override
	public List<ContactDTO> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactDTO getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatContact(ContactDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
