package com.sakadream.jsf.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Schedules {

	List<ScheduleData> schedules;
}
