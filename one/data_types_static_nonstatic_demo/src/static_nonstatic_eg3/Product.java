package static_nonstatic_eg3;

public class Product {

	int x;
	int y;//x & y are called global object/instance level variables
	static int z; //z is called as global class level variable(common to all objects)
	
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.x=99;
		p1.y=100;
		
		System.out.println("Printing for p1");
		p1.printXYZ();
		
		Product p2=new Product();
		//p2.x=66;
		p2.y=10000;
		z=8888;
		
		System.out.println("\nPrinting for p2");
		p2.printXYZ();
		
		
		System.out.println("\nPrinting for p1 again");
		p1.printXYZ();
		
	}
	
	public void printXYZ() {
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}
}
