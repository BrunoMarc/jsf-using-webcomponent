package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Responsible{
    public String name;
    public Object profissionalRecord;
    public Object council;
    public boolean isValidated;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
