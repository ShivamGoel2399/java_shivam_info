package data_type_eg;

public class DataTypeDemo {

	public static void main(String[] args) {
		/*
		 * Data Type -> The one which describes type of the memory which I want to hold the data for.  Every type comes with its own size.
		 * Java has 8 primitive data types
		 * 
		 * datatype		size(in bytes)		defaultValue
		 * ---------------------------------------------------
		 * byte			1						0
		 * short		2						0
		 * int			4						0
		 * long			8						0L
		 * 
		 * (decimal values are larger than whole numbers)
		 * float		4						0.00000f
		 * double		8						0.00000d (any decimal values in java by default are considered as double)
		 * 
		 * char			2						'\u0000'	(java supports unicode charset)
		 * boolean		1bit					false		
		 */
		
		int x=10;
		System.out.println("x = "+x);
		
		
		long m=123456789011L;
		System.out.println("m = "+m);
		
		float f=12.4f;
		System.out.println("f = "+f);
		
		
		/*
		 * Type Casting - Conversion of one of the compitable types to another one
		 * 1)Implicit Casting - (smaller size of type is assigned to larger size of type) which is taken care by compiler itself implicitly/
		 * 2)Explicit Casting -(larger tyoe in size when we assign it to smaller type in size) which should be done by us(programmer) explicitly
		 */
		
		
		
		
		double d=f; //implicit
		System.out.println("d = "+d);
		d=m; //implicit
		System.out.println("d = "+d);
		
		d=x;//implicit
		System.out.println("d = "+d);
		
		f=x;//implicit (float=int)
		System.out.println("f = "+f);
		
		
		
		int c=100;
		char s=(char)c; //explicit
		System.out.println("s = "+s);
		
		
		
		float f1=22.444f;
		System.out.println("f1 = "+f1);
		int h=(int) f1; //explicit
		System.out.println("h = "+h);
		
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
	}
}
