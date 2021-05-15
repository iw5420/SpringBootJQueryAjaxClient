package com.javasampleapproach.jqueryajax.model;

public class Customer2 {
    private String firstname;
    private String lastname;
    private String test;

    public Customer2(){}

    public Customer2(String firstname, String lastname, String test) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.test = test;
    }

    // firstname
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     
    // lastname
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}