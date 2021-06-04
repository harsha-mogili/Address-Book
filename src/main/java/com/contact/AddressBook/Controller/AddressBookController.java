package com.contact.AddressBook.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world";
    }
}
