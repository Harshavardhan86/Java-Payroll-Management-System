package payroll;

import java.util.Scanner;

public class EmployeMain{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		PayrollSystem payrollsystem=new PayrollSystem();
		
		FullTimeEmployee emp1=new FullTimeEmployee("Harsha", 01, 25000);
		
		PartTimeEmployee emp2=new PartTimeEmployee("Sai", 02, 4, 850);
		
		FullTimeEmployee emp3=new FullTimeEmployee("Akhil", 03, 20000);
		
		PartTimeEmployee emp4=new PartTimeEmployee("Jaffar", 04, 4, 800);
		
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		payrollsystem.addEmployee(emp3);
		payrollsystem.addEmployee(emp4);
		
		System.out.println("Employes Details");
		payrollsystem.displayEmployee();
		
		System.out.println();
		System.out.println("Enter id to remove Employe:");
		int id=sc.nextInt();
		payrollsystem.removeEmployee(id);
		
		System.out.println();
		System.out.println("Employes Details");
		payrollsystem.displayEmployee();
		
		sc.close();
	}
}