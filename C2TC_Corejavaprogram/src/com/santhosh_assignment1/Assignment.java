package com.santhosh_assignment1;
import com.santhosh_assignment.utlities.EmployeeUtilities;
import com.santhosh_assignment1.employees.Developer;
import com.santhosh_assignment1.employees.Manager;

public class Assignment { 

	public static void main(String[] args) {
		
		    
		        Manager manager = new Manager("santhosh", "M001", 80000, "HR");
		        Developer developer = new Developer("santhosh", "D001", 60000, "Java");

		        System.out.println("Manager Details:");
		        EmployeeUtilities.printEmployeeDetails(manager);
		        EmployeeUtilities.increaseSalary(manager, 10);

		        System.out.println("\nDeveloper Details:");
		        EmployeeUtilities.printEmployeeDetails(developer);
		        EmployeeUtilities.increaseSalary(developer, 15);
		    }
		}

	