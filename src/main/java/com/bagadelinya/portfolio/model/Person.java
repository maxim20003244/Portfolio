package com.bagadelinya.portfolio.model;

import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String subject;
    private String message;

    @Override
    public String toString() {
        return
                " First Name= " + firstName + "\n" +
                " Last Name= " + lastName + "\n" +
                " Email= " + email + "\n" +
                " Subject= " + subject + "\n" +
                " Message= " + message + "\n" ;
    }
}
