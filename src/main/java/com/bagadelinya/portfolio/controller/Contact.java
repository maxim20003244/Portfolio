package com.bagadelinya.portfolio.controller;

import com.bagadelinya.portfolio.model.Person;
import com.bagadelinya.portfolio.service.ContactService;
import com.bagadelinya.portfolio.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class Contact {
   private final  ContactService contactService;
   private final MailService mailService;


    public Contact(ContactService contactService, MailService mailService) {
        this.contactService = contactService;
        this.mailService = mailService;
    }

    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessages(Person person){
        System.out.println(contactService.saveMsg(person));
        return  new ModelAndView("redirect:/home");

    }
    @RequestMapping(value = "/sendMsg")
    public ModelAndView sendMessages(Person person){
         mailService.sendNotification(person);
         return  new ModelAndView( "redirect:/home");
    }
}
