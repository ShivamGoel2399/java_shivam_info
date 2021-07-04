package overload_eg;

public class Calculator {

	public void add(int a, int b) {
		System.out.println("void add(int,int) called result is "+(a+b));
	}
	
	public void add(int a, int b,int c) {
		System.out.println("void add(int,int,int) called result is "+(a+b+c));
	}
	
	public float add(float a, float b) {
		System.out.println("void add(float,float) called result is ");
		return a+b;
	}
}
