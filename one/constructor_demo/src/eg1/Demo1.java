package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		Calculator c=new Calculator(100,200);
//		c.x=100;
//		c.y=200;
		
		c.add();
		c.multiply();
		c.subtract();
		
		Calculator c1=new Calculator("hello");
		c1.add();

	}

}
