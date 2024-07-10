package com.boa.service;

import java.util.ArrayList;
import java.util.List;

import com.boa.model.CustomerModel;

public class CustomerImpl implements Customer {
	List<CustomerModel> cust = new ArrayList<>();
	@Override
	public void createCustomer(CustomerModel customer) {
		// TODO Auto-generated method stub
		cust.add(customer);
	}

	@Override
	public CustomerModel getCustomer(String name) {
		// TODO Auto-generated method stub
		for(CustomerModel customer:cust) {
			if(customer.getCustomerName().equalsIgnoreCase(name)) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public void updateCustomer(String name, CustomerModel custNew) {
		// TODO Auto-generated method stub
		for(CustomerModel customers: cust ) {
			if(customers.getCustomerName().equalsIgnoreCase(name)) {
				customers.setCustomerID(custNew.getCustomerID());
				customers.setCustomerAddress(custNew.getCustomerAddress());
				customers.setCustomerName(custNew.getCustomerName());
			}
		}
	}

	@Override
	public void deleteCustomer(String name) {
		// TODO Auto-generated method stub
		cust.removeIf(e->e.getCustomerName().equalsIgnoreCase(name));
	}

	@Override
	public String getCustomers() {
		// TODO Auto-generated method stub
		return cust.toString();
	}

}
