/**
 * 
 */
package com.boa.model;

/**
 * 
 */
public class CustomerModel {
	
	private int customerID;
	private String customerName;
	public CustomerModel() {
		
	}
	public CustomerModel(int customerID, String customerName, String customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	private String customerAddress;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "CustomerModel [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}

}