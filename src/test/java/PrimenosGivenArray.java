import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class PrimenosGivenArray {
	@Test
	public void primenosGivenArray() {
		int[] arr = { 1, 9, 3, 5, 2, 6, 7, 4 };
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int num : arr) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				// System.out.print(num+" ");
				a.add(num);
			}

		}
		System.out.println(a);

	}

	@Test
	public void primenosGivenArray1() {
		int[] arr = { 1, 9, 3, 5, 2, 6, 7, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(arr[i]);
			}
		}
	}
	@Test
 	public void reverse() {
		int[] arr = { 1, 9, 3, 5, 2, 6, 7, 4 };
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
			
		}
}
}