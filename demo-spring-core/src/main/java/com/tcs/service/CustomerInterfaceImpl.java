package com.tcs.service;
import java.util.Scanner;
public class CustomerInterfaceImpl implements CustomerInterface {
	   String name;
	public String addCustomer() {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	name=sc.nextLine();
	System.out.println("Customer added successfully..");
	return "Customer added successfully..";
		}
	
	public String show() {
		System.out.println("printed name:"+ name);
		return "printed name:" + name;
	}
	
	public String delete() {
		System.out.println("Customer del successfully..");
		return "Customer del successfully..";
	}

	




	}


