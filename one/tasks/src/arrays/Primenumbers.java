package arrays;

public class Primenumbers {

	public static void isPrimeNumber(int a) {
		int i, flag = 0;
		if (a == 0 || a == 1)
			System.out.println(" NO " + a + " is not a Prime Number");
		else {
			for (i = 2; i <= (a / 2); i++) {
				if (a % i == 0) {
					System.out.println(" NO " + a + " is not a Prime Number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" YES " + a + " is a Prime Number");
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 17, 99, 91, 97, 29, 44, 65, 83, 199, 223, 787, 997, 107, 108 };
		for (int j = 0; j < arr.length; j++) {
			isPrimeNumber(arr[j]);
		}

	}

}
