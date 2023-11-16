package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class practice {
	@Test
	private void pubi() {
		int[] a = { 2, 4, 5, 8, 9 };
		int[] b = { 1, 5, 8, 7 };
		int length = a.length;
		if (a.length < b.length) {
			length = a.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i] + b[i]);

			} catch (Exception e) {
				if (a.length < b.length) {
					System.out.println(b[i]);
				} else {
					System.out.println(a[i]);
				}
			}
		}
	}

//---------------------------------------------------------------------------------------------------//
	@Test
	public void amstrong() {
		int num = 153, temp = num, sum = 0, rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == temp) {

			System.out.println("its a ams. no" + sum);
		} else {
			System.out.println("its not a amstrong no");
		}
	}
// ---------------------------------------------------------------------------------------------------//

	@Test
	public void charisalphaornot() {
		char ch = 'v';
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a alpha");

		} else {
			System.out.println(ch + " is not a alpha");
		}
	}
//---------------------------------------------------------------------------------------------------//


	@Test
	public void extracnofromgivenno() {
		int num = 153, rem = 0;
		while (num > 0) {
			rem = num % 10;
			System.out.println("" + rem);

			num = num / 10;

		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void factorial() {
		int num = 6;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void fibonacci() {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i <= 10; i++) {

			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);

		}
	}
//---------------------------------------------------------------------------------------------------//


	@Test
	public void factorsofgivenno() {
		int num = 15;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);

			}

		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void nooffactorsforgivenno() {
		int num = 15, count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)

			{
				count++;
			}

		}
		System.out.println(count);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void perfect() {
		int num = 6, sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;

			}

		}
		if (num == sum) {
			System.out.println("its a perfect no");
		} else {
			System.out.println("its  not a perfect no");
		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void primenoingivenarray() {
		int[] arr = { 1, 3, 2, 7, 9, 5, 11 };
		for (int num : arr) {
			int count = 0;

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}

			}
			if (count == 2) {

				System.out.println(num + " is a prime no");
			}

		}

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void printnoin_given_format() {
		int n = 1;
		for (int i = 0; i <= 6; i++) {
			System.out.println(n + " ");
			n = (n * 2) + 1;
		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void printnofromgiven1to30() {
		int num = 30;
		for (int i = 1; i <= num; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + "is  a prime no");
			}

		}

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void palindrome() {
		int num = 12214221, rem = 0, sum = 0, temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println(sum + "is a palidrome");
		} else {

			System.out.println(sum + "not a palidrome");

		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void specialno() {
		int num = 1245, rem = 0, sum = 0, temp = num;
		while (num > 0) {
			int fact = 1;
			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println(sum + "is a special no");
		} else {
			System.out.println(sum + "not  a special no");

		}

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void sumofevenno() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void findlengthofstringwithoutusinglength() {
		String s = "Sandur";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
			count++;

		}
		System.out.println(count);
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void appending0tolast() {
		int[] a = { 1, 4, 0, 0, 5, 7, 8, 0 };
		int[] b = new int[a.length];
		int m = 0;
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[m] = a[i];
				m++;
			} else {
				b[n] = a[i];
				n--;
			}

		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("" + b[i]);
		}
	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void countnoof_duplicatesrepeateinan_array() {
		int[] a = { 1, 2, 5, 8, 5, 1, 8, 8, 7, 9, 1 };
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);

		}
		for (Integer li : list) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (li == a[i]) {
					count++;

				}

			}
			System.out.println(li + "is repeating" + count);

		}

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void countnoof_duplicatesrepeateinan_array1() {
		int[] a = { 1, 2, 5, 8, 5, 1, 8, 8, 7, 9, 1 };
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);

		}
		for (Integer li : list) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (li == a[i]) {
					count++;

				}

			}
			if (count > 1) {
				System.out.println(li + "is repeating" + count);

			}
		}
	}
//---------------------------------------------------------------------------------------------------//
	@Test
	public void swapping2nowithusingvariable() {
		int a = 30;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	}

	@Test
	public void swapping2nowithoutusing3variable() {
		int a = 30;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void sum_ofmin3no() {
		int[] a = { 1, 7, 5, 9, 0, 5, 1, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.err.println(sum);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void sum_ofmax3no() {
		int[] a = { 1, 7, 5, 9, 0, 5, 1, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.err.println(sum);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void mul_ofmax3no() {
		int[] a = { 1, 7, 5, 9, 0, 5, 1, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			sum = sum * a[i];
		}
		System.err.println(sum);

	}
//---------------------------------------------------------------------------------------------------//

	@Test
	public void mul_ofmin3no() {
		int[] a = { 1, 7, 5, 9, 0, 5, 1, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}
		int sum = 1;
		for (int i = 0; i < 3; i++) {
			sum = sum * a[i];
		}
		System.err.println(sum);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void ascendingorder() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.println(a[i]);

		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void decendingorder() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.println(a[i]);

		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void firstmin() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(a[0]);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void secondmin() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(a[1]);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void firstmax() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(a[0]);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void secondmax() {
		int[] a = { 7, 9, 5, 1, 5, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(a[1]);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void firstminno() {
		int[] a = { 5, 4, 9, 12, 85, 7, 2, 96 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}

		System.out.println(min);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void firstmaxno() {
		int[] a = { 5, 4, 9, 12, 85, 7, 2, 96 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println(max);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void find1stand2minnoinaanarray() {
		int[] a = { 8, 7, 6, 19, 75 };
		int fmin = a[0];
		int smin = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= fmin) {
				if (a[i] != fmin) {
					smin = fmin;
				}

				fmin = a[i];
			} else if (smin == fmin || smin > a[i]) {
				System.out.println(a[i]);
			}

		}
		System.out.println(fmin);
		System.out.println(smin);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void find1stand2maxnoinaanarray() {
		int[] a = { 8, 7, 6, 19, 75 };
		int fmin = a[0];
		int smin = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= fmin) {
				if (a[i] != fmin) {
					smin = fmin;
				}

				fmin = a[i];
			} else if (smin == fmin || smin < a[i]) {
				System.out.println(a[i]);
			}

		}
		System.out.println(fmin);
		System.out.println(smin);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void combinationof2no() {
		int[] a = { 7, 8, 5, 4, 9, 6, 1, 2, 3, 2, 1, };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 12) {
					System.out.println(a[i] + "         " + a[j]);
				}

			}

		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void positionofanarraywithoutduplicate() {
		int[] a = { 2, 3, 1, 4, 1, 3, 5, 2, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer integer : set) {
			for (int i = 0; i < a.length; i++) {
				if (integer == a[i]) {
					System.out.println(integer + "   " + (i + 1 + "    "));
					break;
				}

			}

		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void positionofanarraywithoutduplicat1e() {
		int[] a = { 2, 3, 1, 4, 1, 3, 5, 2, 2 };

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);

		}
		for (Integer integer : map.values()) {
			for (int i = 0; i < a.length; i++) {
				if (integer == a[i]) {
					System.out.println(integer + "   " + (i + 1) + "    ");
				}

			}

		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void reverseString() {
		String s = "pawan";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prinrtmaxlenth() {
		String[] s = { "12", "159", "78", "7894", "159863247" };
		String max_length = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > max_length.length()) {
				max_length = s[i];

			}

		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == max_length.length()) {
				System.out.println(s[i] + "   ");
			}

		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prinrtminlenth() {
		String[] s = { "12", "159", "783", "7894", "159863247" };
		String min_length = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < min_length.length()) {
				min_length = s[i];

			}

		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == min_length.length()) {
				System.out.println(s[i] + "   ");
			}

		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void segrate() {
		String s = "a1b2%c@3";// abc 123 %@
		String alpha = "";
		String num = "";
		String special = "";
		for (int i = 0; i < s.length(); i++) {
			char st = s.charAt(i);
			if (st >= 'a' && st <= 'z' || st >= 'A' && st <= 'Z') {
				alpha = alpha + st;
			} else if (st >= '0' && st <= '9') {
				num = num + st;

			} else {
				special = special + st;

			}

		}
		System.out.println(special + "" + num + "" + alpha);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm1() {
		String str = "wlecom to expleo ";//
		String[] s = str.split(" ");
		// s[o]=I s[1]=am s[2]=from s[3]=TestYantra
		String temp = s[0];
		s[0] = s[s.length - 1];
		s[s.length - 1] = temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm2() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("print before the element inserted");
		for (int i : arr) {
			System.out.println(i);

		}
		System.out.println("on which location");
		int location = sc.nextInt();
		System.out.println("enter the elements to be inserted");
		int value = sc.nextInt();
		for (int i = arr.length - 1; i > location; i--) {
			arr[i] = arr[i - 1];

		}
		arr[location] = value;
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	private void arraya3b2cd2() {
		String str = "a3b2cd2";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch < 'Z' || ch >= 'a' && ch < 'z') {
				System.out.print(ch);

			} else {

				int x = Character.getNumericValue(ch);

				for (int j = 1; j < x; j++) {

					System.out.print(str.charAt(i - 1));
				}
			}

		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void arrayaaabbcdd() {
		String str = "aaabbcdd";
		String s = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));

		}
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.print(ch + "" + count);

			}
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void findfirstMaxnoinArraywithoutusingbbsort() {
		int[] a = { 7, -3, 0, 2, 1, -9 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(" the first max no in an array is " + max);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm() {

		HashSet<Integer> inputSet = new HashSet<>();
		inputSet.add(2);
		inputSet.add(3);
		inputSet.add(7);

		// Define the range (1 to 10)
		int minRange = 1;
		int maxRange = 10;

		// Find and print missing numbers
		System.out.print("Missing numbers: ");
		for (int i = minRange; i <= maxRange; i++) {
			if (!inputSet.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prglm1() {
		String input = "aabcbbdeaa";
		// aa ab bc cb bb bd de ea aa
		System.out.println("Input string: " + input);
		System.out.println("Substrings of length " + 2 + ":");

		for (int i = 0; i <= input.length()-2 ; i++) {
			String substring = input.substring(i, i +2);
			System.out.print(substring + " ");
		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm3() {
		// I/p= my name is Radha O/p=mynameisRadha
		String s = "my name is Radha";
		String[] ss = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]);
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmm() {
		String[] ss = { "Vijay", "Vivek", "Jawahar" };
		for (String s : ss) {
			System.out.println(s);

			int count = 0;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
						|| s.charAt(j) == 'u') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmm3() {
		String s = "IMMUNUTIES";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U')
				count++;

		}
		System.out.println(count);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmm4() {
		String s = "education";
		System.out.println("Original String: " + s);

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				switch (c) {
				case 'a':
					ch[i] = 'e';

					break;
				case 'e':
					ch[i] = 'i';

					break;
				case 'i':
					ch[i] = 'o';

					break;
				case 'o':
					ch[i] = 'u';

					break;
				case 'u':
					ch[i] = 'a';

					break;

				default:
					// Handle uppercase vowels as well
					ch[i] = (char) (c + 32); // Convert to lowercase
					break;
				}
			}

		}
		System.out.println(ch);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmtoprintcombinationofnumber() {
		int[] a = { 8, 4, 3, 9, 2, 7, 5, 6 };// 11
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 11) {
					System.out.println(a[i] + "          " + a[j]);
				}
			}

		}

	}
	//---------------------------------------------------------------------------------------------------//

	/**
	 * String S1= "ABC"; String S2= "xyz"; String S3= "xyz"; How many objects will
	 * be created? three String objects will be created, but the third one will
	 * reuse the existing "xyz" object from the string pool.
	 */
	@Test
	public void pub7() {
		String str = "java234str789";
		String p = str.replaceAll("[^0-9]", "");
		System.out.println(p);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmmm() {
		String input = "update.decline.accept.include";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar == '.') {
				result.append(' '); // Replace dot with space
			} else {
				result.append(currentChar);
			}
		}
		//---------------------------------------------------------------------------------------------------//

		String stringWithSpaces = result.toString();
		System.out.println("String with dots replaced by spaces: " + stringWithSpaces);

		// Count the occurrences of 'c' in the string
		int count = 0;
		for (int i = 0; i < stringWithSpaces.length(); i++) {
			if (stringWithSpaces.charAt(i) == 'c') {
				count++;
			}
		}

		System.out.println("Count of 'c' in the string: " + count);

		// Print characters along with their count
		System.out.println("Characters and their counts:");
		for (int i = 0; i < stringWithSpaces.length(); i++) {
			char currentChar = stringWithSpaces.charAt(i);
			int charCount = 0;

			// Count the occurrences of the current character
			for (int j = 0; j < stringWithSpaces.length(); j++) {
				if (stringWithSpaces.charAt(j) == currentChar) {
					charCount++;
				}
			}

			// Avoid duplicate printing of characters
			if (i == stringWithSpaces.indexOf(currentChar)) {
				System.out.println(currentChar + ": " + charCount);
			}
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void anagram() {
		String str1 = "listen";
		String str2 = "sievnt";
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		if (s1.length != s2.length) {
			System.out.println("String is not an anagram");
		} else {
			Arrays.sort(s1);
			Arrays.sort(s2);
			if (Arrays.equals(s1, s2) == true) {
				System.out.println("Strings are Anagram");
			} else {
				System.out.println("String is not an anagram");

			}
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void pp() {

		List<Integer> inputList = new ArrayList<>();
		inputList.add(1);
		inputList.add(2);
		inputList.add(3);
		System.out.println(inputList);
		List<Integer> outputList = new ArrayList<>();

		for (int i = 0; i < inputList.size(); i++) {
			if (i == 0) {
				// If it's the first element, add the next element only
				outputList.add(inputList.get(i) + inputList.get(i + 1));
			} else if (i == inputList.size() - 1) {
				// If it's the last element, add the previous element only
				outputList.add(inputList.get(i - 1) + inputList.get(i));
			} else {
				// For other elements, add both previous and next elements
				outputList.add(inputList.get(i - 1) + inputList.get(i) + inputList.get(i - 1));
			}
		}

		System.out.println(outputList);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void pattern1() {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgmmmmm() {
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s2);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void pp1() {
		int[] input = { 1, 3, 5, 7, 9 };
		int k = 1;

		int n = input.length;
		int[] output = new int[n];

		for (int i = 0; i < n; i++) {
			int newPosition = (i + k) % n; // Calculate the new position after rotation
			output[newPosition] = input[i]; // Place the element in the new position
		}

		System.out.println(Arrays.toString(output));
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm4() {
		System.out.println('A' + 'B');
		System.out.println(10 + 20 + "chandan");
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void pattern5() {
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
		int n = 5;
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	private void pub() {
		int[] a = { 1, 2, 7, 9, 16, 99, 100 };
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				aa.add(a[i]);
			}
		}
		System.out.println(aa);

		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 == 1) {
				ab.add(a[j]);
			}
		}
		System.out.println(ab);

	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void paub() {
		String str = "abcde";
		String str1 = "1234";
		String output = "";
		int len1 = str.length();
		int len2 = str1.length();
		int i = 0, j = 0;

		while (i < len1 || j < len2) {
			if (i < len1) {
				output = output + (str.charAt(i));
				i++;
			}
			if (j < len2) {
				output = output + (str1.charAt(j));
				j++;
			}
		}
		System.out.println(output);
	}
	//---------------------------------------------------------------------------------------------------//

	@Test
	public void prgm12() {
		char[] pp = { 'v', 'e', 'e', 'r', 'e', 's', 'h', 'a' };

		for (int i = 0; i < pp.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pp[j] + " ");
			}
			System.out.println();
		}
	}
}
