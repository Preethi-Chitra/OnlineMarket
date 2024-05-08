package com.onlicemarket;

import java.util.Scanner;

public class OnlineMarket {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to SS Market");
		//Customer Details
	    System.out.print("Enter your name: ");
		  String name = scanner.nextLine();
        System.out.print("Enter your address: ");
	      String address = scanner.nextLine();
        System.out.print("Purchased items: ");
           String items = scanner.nextLine();

	    //All details
	    System.out.println("\nThank you");
		System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
		System.out.println("Items Purchased: " + items);

		       
		    }
		
	}

 
	