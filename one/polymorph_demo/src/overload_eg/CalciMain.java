package overload_eg;

public class CalciMain {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add(10, 22);
		c.add(99, 99, 9000);
		float res=c.add(23.3f, 44.99f);
		System.out.println(res);
	}

}
