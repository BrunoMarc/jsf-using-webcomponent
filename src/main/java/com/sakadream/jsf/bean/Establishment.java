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
}
