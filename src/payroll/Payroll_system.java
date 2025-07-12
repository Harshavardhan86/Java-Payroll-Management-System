package payroll;

import java.util.ArrayList;

class PayrollSystem{
	
	private ArrayList<Employe> employeeList;
	
	public PayrollSystem() {
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employe employe) {
		employeeList.add(employe);
	}
	
	public void removeEmployee(int id) {
		Employe employeToRemove=null;
		
		for(Employe employe:employeeList) {
			if(employe.getId()==id) {
				employeToRemove=employe;
				break;
			}
		}
		
		if(employeToRemove!=null) {
			employeeList.remove(employeToRemove);
		}else {
			System.out.println("Employe Not Found");
		}
	}
	
	public void displayEmployee() {
		for(Employe employe: employeeList) {
			System.out.println(employe);
		}
	}
		
}

