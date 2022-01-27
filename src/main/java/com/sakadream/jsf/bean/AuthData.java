package com.sakadream.jsf.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthData {
	public String token;
    public User user;
}