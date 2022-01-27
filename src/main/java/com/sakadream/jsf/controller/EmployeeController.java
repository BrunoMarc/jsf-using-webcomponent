package com.sakadream.jsf.controller;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

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

    public List<Employee> showAllEmployees() throws SQLException, ClassNotFoundException {
        return func.showAllEmployees();
    }
    
    public ScheduleData[] showSchedules() throws SQLException, ClassNotFoundException {

    	WebClient webClient = WebClient.create("https://apitest.encaixe.me");
    	EstablishmentInfo responseJson = webClient.get()
    	                               .uri("/establishments/ciasc/info")
    	                               .exchange()
    	                               .block()
    	                               .bodyToMono(EstablishmentInfo.class)
    	                               .block();
    	
    	AuthData responseJsonValidate = webClient.post()
    	                               .uri("/patient/validate")
    	                               .bodyValue("{\"name\":\"Bruno Marchini\",\"whatsapp_number\":\"5511994121131\"}")
    	                               .exchange()
    	                               .block()
    	                               .bodyToMono(AuthData.class)
    	                               .block();
    	
    	ScheduleData[] responseJsonSchedules = webClient.get()
                .uri("/establishments/"+responseJson.establishment.id+"/schedules?value=2&reason=37")
                .header("Authorization", responseJsonValidate.token)
                .exchange()
                .block()
                .bodyToMono(ScheduleData[].class)
                .block();
    			


    			System.out.println(responseJson);
    			System.out.println(responseJsonValidate);
    			System.out.println(responseJsonSchedules);



        return responseJsonSchedules;
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
}
