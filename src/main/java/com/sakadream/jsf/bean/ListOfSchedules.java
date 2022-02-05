package com.sakadream.jsf.bean;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfSchedules {
    public List<Schedule> scheduleData = new ArrayList<Schedule>();

	public List<Schedule> getScheduleData() {
		return scheduleData;
	}

	public void setScheduleData(List<Schedule> scheduleData) {
		this.scheduleData = scheduleData;
	}
    
    

}
