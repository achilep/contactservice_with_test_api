package com.contacts.contactsrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contacts.models.Contacts;
@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Integer>{
	

}
