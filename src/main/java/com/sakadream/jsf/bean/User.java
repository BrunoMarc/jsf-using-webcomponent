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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getBirthday() {
		return birthday;
	}
	public void setBirthday(Object birthday) {
		this.birthday = birthday;
	}
	public Object getMotherName() {
		return motherName;
	}
	public void setMotherName(Object motherName) {
		this.motherName = motherName;
	}
	public Object getGender() {
		return gender;
	}
	public void setGender(Object gender) {
		this.gender = gender;
	}
	public Object getPhone() {
		return phone;
	}
	public void setPhone(Object phone) {
		this.phone = phone;
	}
	public Object getHasAuthorizedMessages() {
		return hasAuthorizedMessages;
	}
	public void setHasAuthorizedMessages(Object hasAuthorizedMessages) {
		this.hasAuthorizedMessages = hasAuthorizedMessages;
	}
	public Object getCpf() {
		return cpf;
	}
	public void setCpf(Object cpf) {
		this.cpf = cpf;
	}
	public String getWhatsappNumber() {
		return whatsappNumber;
	}
	public void setWhatsappNumber(String whatsappNumber) {
		this.whatsappNumber = whatsappNumber;
	}
	public Object getRoleId() {
		return roleId;
	}
	public void setRoleId(Object roleId) {
		this.roleId = roleId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    
}
