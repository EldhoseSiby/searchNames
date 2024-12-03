package com.contactdetails.contactdetails.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.contactdetails.contactdetails.dto.IdNameDto;
import com.contactdetails.contactdetails.entity.ContactsEntity;

@Repository
public interface ContactsRepo extends MongoRepository<ContactsEntity, String> {

    @Query(value = "{}", fields = "{'id': 1, 'name': 1, '_id': 0}")
    List<IdNameDto> findAllIdAndName();

public ContactsEntity findByName(String name);

}

