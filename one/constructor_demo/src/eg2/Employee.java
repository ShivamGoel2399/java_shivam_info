package eg2;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String city;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	
	
	
	
	public Employee(int id, String name, int age, String city) {
		this(id,name); //constructor chaining
		this.age = age;
		this.city = city;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public void setCity(String city) {
		this.city=city;
	}




	public void printEmployee() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
	}
}
