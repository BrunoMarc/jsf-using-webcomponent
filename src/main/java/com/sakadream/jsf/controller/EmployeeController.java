package com.sakadream.jsf.controller;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.client.WebClient;

import com.sakadream.jsf.bean.AuthData;
import com.sakadream.jsf.bean.Employee;
import com.sakadream.jsf.bean.EstablishmentInfo;
import com.sakadream.jsf.bean.ScheduleData;
import com.sakadream.jsf.func.Functions;

/**
 * Created by Phan Ba Hai on 18/07/2017.
 */

@ManagedBean(name = "emp", eager = true)
@RequestScoped
public class EmployeeController implements Serializable {

    private Functions func = new Functions();
    WebClient webClient = WebClient.create("https://apitest.encaixe.me");
    
	public String username = func.getSession().getValue("username").toString();
	public String celnumber = func.getSession().getValue("celnumber").toString();
	EstablishmentInfo establishmentInfo = null;
	AuthData authData = null;
	public String reasonOption = "";
	ScheduleData[] responseJsonSchedules = null;
	public ScheduleData selectedSchedule = null;

	
	public EmployeeController() {
		  	System.out.println("username: "+username);
	        System.out.println("celnumber: "+celnumber);

	       
	    	establishmentInfo = webClient.get()
	    	                               .uri("/establishments/ciasc/info")
	    	                               .exchange()
	    	                               .block()
	    	                               .bodyToMono(EstablishmentInfo.class)
	    	                               .block();
	    	
	    	authData = webClient.post()
	    	                               .uri("/patient/validate")
	    	                               .bodyValue("{\"name\":\""+username+"\",\"whatsapp_number\":\"55"+celnumber+"\"}")
	    	                               .exchange()
	    	                               .block()
	    	                               .bodyToMono(AuthData.class)
	    	                               .block();
	}

    public List<Employee> showAllEmployees() throws SQLException, ClassNotFoundException {
        return func.showAllEmployees();
    }
    
    public ScheduleData[] showSchedules() throws SQLException, ClassNotFoundException {
    	
    	

    	
      
    	
    	responseJsonSchedules = webClient.get()
                .uri("/establishments/"+establishmentInfo.establishment.id+"/schedules?value=2&reason="+reasonOption)
                .header("Authorization", authData.token)
                .exchange()
                .block()
                .bodyToMono(ScheduleData[].class)
                .block();
    			


    			System.out.println(establishmentInfo);
    			System.out.println(authData);
    			System.out.println(responseJsonSchedules);



        return responseJsonSchedules;
    }
    
    
    public void showSelectedSchedules() {
    	System.out.println(this.selectedSchedule);
    }

    public Employee getEmployee() throws SQLException, ClassNotFoundException {
        String idStr = func.getParameterByName("id");
        int id;
        try {
            id = Integer.valueOf(idStr);
        } catch (NumberFormatException e) {
            id = 0;
        }
        return func.getEmployeeById(id);
    }

    public String addEmployee() throws SQLException, ClassNotFoundException {
        String fullName = func.getParameterByName("fullName");
        String address = func.getParameterByName("address");
        String email = func.getParameterByName("email");
        String phone = func.getParameterByName("phone");
        String salaryStr = func.getParameterByName("salary");
        int salary = Integer.valueOf(salaryStr);

        func.addEmployee(fullName, address, email, phone, salary);
        return "home";
    }

    public void editEmployee() throws SQLException, ClassNotFoundException, IOException {
        String idStr = func.getParameterByName("editForm:id");
        int id = Integer.valueOf(idStr);
        String fullName = func.getParameterByName("fullName");
        String address = func.getParameterByName("address");
        String email = func.getParameterByName("email");
        String phone = func.getParameterByName("phone");
        String salaryStr = func.getParameterByName("salary");
        int salary = Integer.valueOf(salaryStr);

        func.editEmloyee(id, fullName, address, email, phone, salary);

        FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml"); //Redirect to home.xhtml
    }

    public String deleteEmployee(String idStr) throws SQLException, ClassNotFoundException {
        int id = Integer.valueOf(idStr);

        func.deleteEmployee(id);
        return "home";
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCelnumber() {
		return celnumber;
	}

	public void setCelnumber(String celnumber) {
		this.celnumber = celnumber;
	}

	public EstablishmentInfo getEstablishmentInfo() {
		return establishmentInfo;
	}

	public void setEstablishmentInfo(EstablishmentInfo establishmentInfo) {
		this.establishmentInfo = establishmentInfo;
	}

	public AuthData getAuthData() {
		return authData;
	}

	public void setAuthData(AuthData authData) {
		this.authData = authData;
	}

	public String getReasonOption() {
		return reasonOption;
	}

	public void setReasonOption(String reasonOption) {
		this.reasonOption = reasonOption;
	}

	public ScheduleData[] getResponseJsonSchedules() {
		return responseJsonSchedules;
	}

	public void setResponseJsonSchedules(ScheduleData[] responseJsonSchedules) {
		this.responseJsonSchedules = responseJsonSchedules;
	}

	public ScheduleData getSelectedSchedule() {
		return selectedSchedule;
	}

	public void setSelectedSchedule(ScheduleData selectedSchedule) {
		this.selectedSchedule = selectedSchedule;
	}
	
	
    
    
}
