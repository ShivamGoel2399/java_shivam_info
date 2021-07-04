package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e=new Employee(100, "Sachin");
		System.out.println("Printing e");
		e.printEmployee();
		
		
		Employee e1=new Employee(101, "Raj", 22, "Mumbai");
		System.out.println("\nPrinting e1");
		e1.printEmployee();
		
		
		e.setAge(23);
		e.setCity("Delhi");
		
		System.out.println("\nPrinting e again");
		e.printEmployee();
		
		

	}

}
