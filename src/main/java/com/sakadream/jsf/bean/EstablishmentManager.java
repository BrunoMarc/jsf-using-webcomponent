package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstablishmentManager{
    public String name;
    public String email;
    public Object password;
    public String number;
    public String photoUrl;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
