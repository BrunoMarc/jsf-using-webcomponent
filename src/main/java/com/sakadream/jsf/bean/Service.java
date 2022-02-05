package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Service{
    public Object code;
    public String name;
    public int price;
    public boolean isRestrict;
    public boolean isActive;
    public int estimatedTimeInMinutes;
    public int establishmentId;
    public boolean hasReturn;
    public int returnsPerShift;
    public boolean canBePublic;
    public Date createdAt;
    public Date updatedAt;
    public int id;
	public Object getCode() {
		return code;
	}
	public void setCode(Object code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isRestrict() {
		return isRestrict;
	}
	public void setRestrict(boolean isRestrict) {
		this.isRestrict = isRestrict;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getEstimatedTimeInMinutes() {
		return estimatedTimeInMinutes;
	}
	public void setEstimatedTimeInMinutes(int estimatedTimeInMinutes) {
		this.estimatedTimeInMinutes = estimatedTimeInMinutes;
	}
	public int getEstablishmentId() {
		return establishmentId;
	}
	public void setEstablishmentId(int establishmentId) {
		this.establishmentId = establishmentId;
	}
	public boolean isHasReturn() {
		return hasReturn;
	}
	public void setHasReturn(boolean hasReturn) {
		this.hasReturn = hasReturn;
	}
	public int getReturnsPerShift() {
		return returnsPerShift;
	}
	public void setReturnsPerShift(int returnsPerShift) {
		this.returnsPerShift = returnsPerShift;
	}
	public boolean isCanBePublic() {
		return canBePublic;
	}
	public void setCanBePublic(boolean canBePublic) {
		this.canBePublic = canBePublic;
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
