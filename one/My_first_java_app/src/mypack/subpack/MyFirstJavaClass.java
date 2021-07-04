package mypack.subpack;

import java.util.Arrays;

public class MyFirstJavaClass {

	public  static void main(String[] vinay) {
		if(vinay!=null && vinay.length>0) {
		System.out.println("content of vinay array is : "+Arrays.toString(vinay));
		}
		System.out.println("Heyy");
		iAmStatic();
		//return 0;
	}
	
	public static void iAmStatic() {
		System.out.println("Hello i am static");
	}
	
	private class InnerPrivate{
		public class InnerInnerClass{}
	}
	
	protected class InnerProtected{}
	
	public class InnerPublic{}
	
	public static class  InnerStaticClass{}
}

 
 
 //Bad Practice
  class A{}
  
  class B{}
  
  class X{}