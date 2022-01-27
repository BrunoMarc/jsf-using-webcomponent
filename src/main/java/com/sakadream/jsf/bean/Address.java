package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address{
    public String city;
    public String state;
    public String street;
    public String neighborhood;
    public String complement;
    public int number;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}