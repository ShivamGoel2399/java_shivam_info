package arrays;

public class Palindrome {

	public static void is_palindrome(int a) {

		int temp = a, b, n = 0;
		while (a > 0) {
			b = a % 10;
			n = n * 10 + b;
			a = a / 10;
		}
		if (temp == n)
			System.out.println(" Yes " + temp + " is a palindrome");
		else
			System.out.println(" No " + temp + " is not a palindrome");
	}

	public static void main(String[] args) {

		int ar[] = { 12321, 45678, 834, 765567, 787, 789000, 4343 };
		for (int i = 0; i < ar.length; i++) {
			is_palindrome(ar[i]);
		}

	}

}
