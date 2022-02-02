package com.sakadream.jsf.bean; 
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReasonOption{
    public String label;
    public boolean hidden;
    public boolean restrict;
    public Category category;
    public Value value;
    public Date createdAt;
    public Date updatedAt;
    public int id;
    public ArrayList<Object> reasonOptions;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public boolean isRestrict() {
		return restrict;
	}
	public void setRestrict(boolean restrict) {
		this.restrict = restrict;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
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
	public ArrayList<Object> getReasonOptions() {
		return reasonOptions;
	}
	public void setReasonOptions(ArrayList<Object> reasonOptions) {
		this.reasonOptions = reasonOptions;
	}
    
    
}
