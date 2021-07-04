package static_nonstatic_eg;

import static_nonstatic_eg2.Hello;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Hello from main");
		iamStatic();  //static method of the same class
		
		Demo1 d=new Demo1(); //creation of object -> Classname objectname =new ClassName()
		
		d.iamNonStatic();
		d.iamNonStaticAgain();
		
		Calculator.iamStatic(); //static method of other class
		
		Calculator c=new Calculator();
		c.iamNonStatic();
		c.iamNonStaticAgain();
		
		Hello.iamStatic();
		
		Hello h=new Hello();
		//h.iamNonStaticAgain(); not visible
		
		

	}
	
	public static void iamStatic() {
		System.out.println("I am static of Demo1 classs");
	}
	
	public  void iamNonStatic() {
		System.out.println("I am non static method of Demo1 classs");
	}
	public  void iamNonStaticAgain() {
		System.out.println("I am non static method again of Demo1 classs");
	}

}
