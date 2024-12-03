package com.contactdetails.contactdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactdetails.contactdetails.dto.IdNameDto;
import com.contactdetails.contactdetails.dto.NameDto;
import com.contactdetails.contactdetails.entity.ContactsEntity;
import com.contactdetails.contactdetails.service.ContactsService;

@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React app
@RestController
@RequestMapping("api/contacts")
public class ContactsController {

    @Autowired
    private ContactsService contactsService;

    @GetMapping("/getids")
    public ResponseEntity<List<IdNameDto>> getAllIdsAndNames() {
        return ResponseEntity.ok(contactsService.getAllIdsAndNames());
    }

    @PostMapping("/getcontact")
    public ResponseEntity<ContactsEntity> getContact(@RequestBody NameDto nameDto) {
        return ResponseEntity.ok(contactsService.getContact(nameDto.getName()));
    }
}
