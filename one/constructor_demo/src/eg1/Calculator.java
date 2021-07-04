package eg1;

public class Calculator {

	private int x;
	private int y;
	
	public Calculator(int x,int y) {
		this.x=x;  //variable shadowing
		this.y=y;
	}
	//Calculator(){}
	
	
	public Calculator(String s) {
		System.out.println("s = "+s);
	}
	
	public void add() {
		System.out.println("Result of "+x+" + "+y+" = "+(x+y));
	}
	
	public void multiply() {
		System.out.println("Result of "+x+" * "+y+" = "+(x*y));
	}
	
	public void subtract() {
		System.out.println("Result of "+x+" - "+y+" = "+(x-y));
	}
}
