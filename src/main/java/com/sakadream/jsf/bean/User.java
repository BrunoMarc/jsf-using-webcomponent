package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    public String name;
    public Object birthday;
    public Object motherName;
    public Object gender;
    public Object phone;
    public Object hasAuthorizedMessages;
    public Object cpf;
    public String whatsappNumber;
    public Object roleId;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
