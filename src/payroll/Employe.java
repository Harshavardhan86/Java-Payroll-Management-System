package payroll;

abstract class Employe {
	
	private String name;
	private int id;
	
	public Employe(String name,int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
	    return String.format("Employee [Name: %s | ID: %d | Salary: ₹%.2f]", getName(), getId(), calculateSalary());
	}

	
}




