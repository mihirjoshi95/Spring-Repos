package com.boa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.config.AppConfig;
import com.boa.config.CentrelizedConfig;
import com.boa.model.CustomerModel;
import com.boa.service.Customer;
import com.boa.service.HelloWorld;

@SpringBootApplication
public class BoaSpringCoreDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BoaSpringCoreDemoApplication.class, args);
//		System.out.println("my first spring boot app");
		ApplicationContext context = SpringApplication.run(AppConfig.class);
		HelloWorld helloworld= (HelloWorld) context.getBean("helloBean");
		System.out.println(helloworld.printDetails("hello spring microservice"));
		
		ApplicationContext context2 = SpringApplication.run(CentrelizedConfig.class);

		Customer customer= (Customer) context2.getBean("customerBean");
		CustomerModel customerModel= new CustomerModel();
		customerModel.setCustomerName("mihir");
		customerModel.setCustomerID(1);
		customerModel.setCustomerAddress("india");

		customer.createCustomer(customerModel);
		
		CustomerModel customerModel2= new CustomerModel();
		customerModel2.setCustomerName("ravi");;
		customerModel2.setCustomerID(2);
		customerModel2.setCustomerAddress("canada");
		customer.createCustomer(customerModel2);
		
		System.out.println(customer.getCustomer("mihir").toString());
		System.out.println(customer.getCustomer("ravi").toString());
		
		CustomerModel customerModel3= new CustomerModel();
		customerModel3.setCustomerName("mihirjoshi");;
		customerModel3.setCustomerID(2);
		customerModel3.setCustomerAddress("canada2");
		customer.updateCustomer("mihir", customerModel3);
		customer.deleteCustomer("ravi");

		System.out.println(customer.getCustomer("mihirjoshi").toString());
		System.out.println(customer.getCustomers().toString());


	}

}
