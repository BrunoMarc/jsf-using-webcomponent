package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location{
    public String latitude;
    public String longitude;
    public String name;
    public String address;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
