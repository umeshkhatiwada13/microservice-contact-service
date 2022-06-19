package com.contact.contactservice.controller;

import com.contact.contactservice.entity.Contact;
import com.contact.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping("user/{userId}")
    public List<Contact> getAllByUser(@PathVariable int userId) {
        System.out.println("Getting contact data for User with id "+userId);
        return contactService.getAllByUser(userId);
    }
}
