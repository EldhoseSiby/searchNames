


package com.contactdetails.contactdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactdetails.contactdetails.dto.IdNameDto;
import com.contactdetails.contactdetails.entity.ContactsEntity;
import com.contactdetails.contactdetails.repository.ContactsRepo;

@Service
public class ContactsService {

    @Autowired
    private ContactsRepo contactsRepo;

    public List<IdNameDto> getAllIdsAndNames() {
        return contactsRepo.findAllIdAndName();
    }

    public ContactsEntity getContact(String name){
        return contactsRepo.findByName(name);
    }
}
