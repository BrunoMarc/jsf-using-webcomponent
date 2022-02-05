package com.sakadream.jsf.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Schedule{
    public String imageUrl;
    public String title;
    public Category category;
    public int returnsPerShift;
    public boolean blocked;
    public Iddleness iddleness;
    public IddlenessOrderShow iddlenessOrderShow;
    public boolean active;
    public Responsible responsible;
    public int establishmentId;
    public int id;
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getReturnsPerShift() {
		return returnsPerShift;
	}
	public void setReturnsPerShift(int returnsPerShift) {
		this.returnsPerShift = returnsPerShift;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public Iddleness getIddleness() {
		return iddleness;
	}
	public void setIddleness(Iddleness iddleness) {
		this.iddleness = iddleness;
	}
	public IddlenessOrderShow getIddlenessOrderShow() {
		return iddlenessOrderShow;
	}
	public void setIddlenessOrderShow(IddlenessOrderShow iddlenessOrderShow) {
		this.iddlenessOrderShow = iddlenessOrderShow;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Responsible getResponsible() {
		return responsible;
	}
	public void setResponsible(Responsible responsible) {
		this.responsible = responsible;
	}
	public int getEstablishmentId() {
		return establishmentId;
	}
	public void setEstablishmentId(int establishmentId) {
		this.establishmentId = establishmentId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    
}
