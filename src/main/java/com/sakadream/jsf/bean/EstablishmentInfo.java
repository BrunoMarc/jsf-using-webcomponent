package com.sakadream.jsf.bean; 
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstablishmentInfo{
    public Establishment establishment;
    public ArrayList<ReasonOption> reasonOptions;
    public VisualInfo visualInfo;
    public ArrayList<SocialMedia> socialMedia;
    public Location location;
	public Establishment getEstablishment() {
		return establishment;
	}
	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}
	public ArrayList<ReasonOption> getReasonOptions() {
		return reasonOptions;
	}
	public void setReasonOptions(ArrayList<ReasonOption> reasonOptions) {
		this.reasonOptions = reasonOptions;
	}
	public VisualInfo getVisualInfo() {
		return visualInfo;
	}
	public void setVisualInfo(VisualInfo visualInfo) {
		this.visualInfo = visualInfo;
	}
	public ArrayList<SocialMedia> getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(ArrayList<SocialMedia> socialMedia) {
		this.socialMedia = socialMedia;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
    
    
}
