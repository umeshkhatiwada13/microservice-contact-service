package com.contact.contactservice.service;

import com.contact.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    List<Contact> contactList = List.of(
            new Contact(1, "ram1@gmail.com", "Ram", 1),
            new Contact(2, "ram1@hotmail.com", "Ram", 1),
            new Contact(3, "sita3@hotmail.com", "Sita", 2),
            new Contact(3, "sita3@yahoo.com", "Sita", 2)
    );

    @Override
    public List<Contact> getAllByUser(int userId) {
        return contactList.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
    }
}
