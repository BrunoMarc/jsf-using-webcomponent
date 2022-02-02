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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getProfissionalRecord() {
		return profissionalRecord;
	}
	public void setProfissionalRecord(Object profissionalRecord) {
		this.profissionalRecord = profissionalRecord;
	}
	public Object getCouncil() {
		return council;
	}
	public void setCouncil(Object council) {
		this.council = council;
	}
	public boolean isValidated() {
		return isValidated;
	}
	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
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
