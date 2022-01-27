package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SocialMedia{
    public String url;
    public Date createdAt;
    public Date updatedAt;
    public int id;
}
