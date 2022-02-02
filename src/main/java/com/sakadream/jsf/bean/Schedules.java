package com.sakadream.jsf.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Schedules {

	List<ScheduleData> schedules;

	public List<ScheduleData> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<ScheduleData> schedules) {
		this.schedules = schedules;
	}
	
	
}
