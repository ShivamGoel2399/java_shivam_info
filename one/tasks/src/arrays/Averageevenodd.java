package arrays;

public class Averageevenodd {
	public static void average(int a[]) {
		int odd_sum = 0, even_count = 0, odd_count = 0, even_sum = 0;
		double even_avg, odd_avg;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even_sum += a[i];
				even_count++;
			} else {
				odd_sum += a[i];
				odd_count++;
			}
		}
		even_avg = even_sum / even_count;
		odd_avg = odd_sum / odd_count;
		System.out.println("Average of even numbers are " + even_avg);
		System.out.println("Average of odd numbers are " + odd_avg);
	}

	public static void main(String[] args) {
		//int arr[] ={2,3,4,5};
		int arr[] = { 12, 34, 23, 56, 54, 78, 98, 76, 78, 67, 45, 23 };
		average(arr);

	}

}
