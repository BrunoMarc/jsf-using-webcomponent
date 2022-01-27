package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IddlenessOrderShow{
    public String name;
    public int orderShow;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
