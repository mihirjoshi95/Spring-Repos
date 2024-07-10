package com.boa.service;


import com.boa.model.CustomerModel;

public interface Customer {
public void createCustomer(CustomerModel customer);
public CustomerModel getCustomer(String name);
public void updateCustomer(String name,CustomerModel customer);
public void deleteCustomer(String name);
public String getCustomers();

}
