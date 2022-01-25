package com.sakadream.jsf.controller;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import com.sakadream.jsf.bean.AuthData;
import com.sakadream.jsf.bean.Employee;
import com.sakadream.jsf.bean.Root;
import com.sakadream.jsf.func.Functions;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

/**
 * Created by Phan Ba Hai on 18/07/2017.
 */

@ManagedBean(name = "emp", eager = true)
@RequestScoped
public class EmployeeController implements Serializable {

    private Functions func = new Functions();
    

    
	HttpClient httpClient = HttpClient.create()
			  .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
			  .responseTimeout(Duration.ofMillis(5000))
			  .doOnConnected(conn -> 
			    conn.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS))
			      .addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS)));

			WebClient client = WebClient.builder()
			  .clientConnector(new ReactorClientHttpConnector(httpClient))
			  .build();

    public List<Employee> showAllEmployees() throws SQLException, ClassNotFoundException {
        return func.showAllEmployees();
    }
    
    public List<Root> showSchedules() throws SQLException, ClassNotFoundException {
    	WebClient webClient2 = WebClient.create("https://api.encaixe.me");

		/*
		 * Flux<Employee> employee = webClient2.get()
		 * .uri("/establishments/nomeFantasia/info") .retrieve()
		 * .bodyToFlux(Employee.class);
		 */
    	
    	WebClient webClient = WebClient.create("https://api.encaixe.me");
    	Root responseJson = webClient.get()
    	                               .uri("/establishments/nomeFantasia/info")
    	                               .exchange()
    	                               .block()
    	                               .bodyToMono(Root.class)
    	                               .block();
    	
    	AuthData responseJsonValidate = webClient.post()
    	                               .uri("/patient/validate")
    	                               .bodyValue("{\"name\":\"Bruno Marchini\",\"whatsapp_number\":\"5511994121131\"}")
    	                               .exchange()
    	                               .block()
    	                               .bodyToMono(AuthData.class)
    	                               .block();
    	
    	String responseJsonSchedules = webClient.get()
                .uri("/establishments/"+responseJson._id+"/schedules?reason=particular&category=consulta")
                .header("Authorization", responseJsonValidate.token)
                .exchange()
                .block()
                .bodyToMono(String.class)
                .block();
    			


    			System.out.println(responseJson);
    			System.out.println(responseJsonValidate);
    			System.out.println(responseJsonSchedules);



        return new ArrayList<Root>();
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
