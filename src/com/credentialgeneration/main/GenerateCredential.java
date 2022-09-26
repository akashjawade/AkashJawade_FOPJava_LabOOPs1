package com.credentialgeneration.main;

import java.util.Scanner;

import com.credentialgeneration.model.Employee;
import com.credentialgeneration.service.CredentialService;

public class GenerateCredential {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	
		Employee employee=new Employee();
		System.out.print("Enter Employee's Firstname: ");
		employee.setFirstName(scanner.next());
		System.out.print("Enter Employee's Lastname: ");
		employee.setLastName(scanner.next());
		employee=new Employee(employee.getFirstName(),employee.getLastName());
		
		CredentialService credentialService=new CredentialService();
				
		System.out.println("please enter the department from the following:");
        System.out.println(" 1. Technical \n 2. Admin \n 3. Human resource \n 4. Legal");		
	  	    
	     int  option=scanner.nextInt();
	     
	      if(option==1) {

	    	  employee.setDepartment("tech");
	    	  
	      }else if(option==2) {

	    	  employee.setDepartment("admin");
	    	  
	      }else if(option==3) {

	    	  employee.setDepartment("hr");
	    	  
	      }else if(option==4) {
	    	
	    	  employee.setDepartment("legal");

	    	  
	      }else {
	    	  System.out.println("enter a valid option");
	    	  scanner.close();
	    	  System.exit(-1); 
	      }
	      String mail=CredentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),employee.getDepartment());
	      String pass=CredentialService.generatePassword();
	      credentialService.showCredentials(employee.getFirstName(),mail,pass);
	      
	 scanner.close();
	 
	     
	}

}
