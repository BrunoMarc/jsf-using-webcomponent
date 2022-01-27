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
}
