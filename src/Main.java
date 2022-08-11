
public class Main {

	public static void main(String[] args) {
		
	Employee employee = new Employee("Ali",4000,48,1998);
	
	
	employee.tax();
	employee.bonus();
	employee.raiseSalary();
	employee.print();
	
	
	Employee employee1 = new Employee("Veli",3000,40,1992);
	
	employee1.tax();
	employee1.bonus();
	employee1.raiseSalary();
	employee1.print();
	
	}
	
}
