package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Iddleness{
    public String name;
    public String idleness;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
