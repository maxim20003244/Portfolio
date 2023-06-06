package com.bagadelinya.portfolio.controller;

import com.bagadelinya.portfolio.model.Person;
import com.bagadelinya.portfolio.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class Contact {
   private final  ContactService contactService;

    public Contact(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessages(Person person){
        System.out.println(contactService.saveMsg(person));
        return  new ModelAndView("redirect:/home");

    }
}
