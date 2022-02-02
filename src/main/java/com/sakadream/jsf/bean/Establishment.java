package com.sakadream.jsf.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Establishment{
    public String name;
    public String cnpj;
    public String phone;
    public String website;
    public String socialReason;
    public String description;
    public String anamneseUrl;
    public String url;
    public String logoUrl;
    public String naturesLabel;
    public boolean useCpf;
    public boolean useManagerPhoto;
    public String schedulingObservationLabel;
    public int addressId;
    public Address address;
    public int establishmentManagerId;
    public EstablishmentManager establishmentManager;
    public Object technicalResponsibleId;
    public Object technicalResponsible;
    public boolean acceptsReturn;
    public boolean acceptsParticular;
    public Date createdAt;
    public Date updatedAt;
    public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getSocialReason() {
		return socialReason;
	}
	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnamneseUrl() {
		return anamneseUrl;
	}
	public void setAnamneseUrl(String anamneseUrl) {
		this.anamneseUrl = anamneseUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getNaturesLabel() {
		return naturesLabel;
	}
	public void setNaturesLabel(String naturesLabel) {
		this.naturesLabel = naturesLabel;
	}
	public boolean isUseCpf() {
		return useCpf;
	}
	public void setUseCpf(boolean useCpf) {
		this.useCpf = useCpf;
	}
	public boolean isUseManagerPhoto() {
		return useManagerPhoto;
	}
	public void setUseManagerPhoto(boolean useManagerPhoto) {
		this.useManagerPhoto = useManagerPhoto;
	}
	public String getSchedulingObservationLabel() {
		return schedulingObservationLabel;
	}
	public void setSchedulingObservationLabel(String schedulingObservationLabel) {
		this.schedulingObservationLabel = schedulingObservationLabel;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEstablishmentManagerId() {
		return establishmentManagerId;
	}
	public void setEstablishmentManagerId(int establishmentManagerId) {
		this.establishmentManagerId = establishmentManagerId;
	}
	public EstablishmentManager getEstablishmentManager() {
		return establishmentManager;
	}
	public void setEstablishmentManager(EstablishmentManager establishmentManager) {
		this.establishmentManager = establishmentManager;
	}
	public Object getTechnicalResponsibleId() {
		return technicalResponsibleId;
	}
	public void setTechnicalResponsibleId(Object technicalResponsibleId) {
		this.technicalResponsibleId = technicalResponsibleId;
	}
	public Object getTechnicalResponsible() {
		return technicalResponsible;
	}
	public void setTechnicalResponsible(Object technicalResponsible) {
		this.technicalResponsible = technicalResponsible;
	}
	public boolean isAcceptsReturn() {
		return acceptsReturn;
	}
	public void setAcceptsReturn(boolean acceptsReturn) {
		this.acceptsReturn = acceptsReturn;
	}
	public boolean isAcceptsParticular() {
		return acceptsParticular;
	}
	public void setAcceptsParticular(boolean acceptsParticular) {
		this.acceptsParticular = acceptsParticular;
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
