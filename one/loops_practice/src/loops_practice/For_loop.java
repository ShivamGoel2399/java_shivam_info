package loops_practice;

public class For_loop {

	public static void main(String[] args) {
		for (int x=0;x<=10;x++) {
			System.out.println("cube of "+x+" is "+(x*x*x));
		}
		String abc[] = {"a","b","c","d","e"};	
		for(String y : abc  )
			System.out.println(y);
	}

}
