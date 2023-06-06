package com.bagadelinya.portfolio.service;

import com.bagadelinya.portfolio.model.Person;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
   public String saveMsg (Person person){
        String save;
        save = person.toString();
        return save;

    }
}
