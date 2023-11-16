package java_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

class Interview {
	@Test
	public void leapyear() {
		int year=2012;
 		if (year%4==0||year%100==0||year%400==0) {
			 
 
	System.out.println("its a  leap year"+year);}
else {
	System.out.println("its a  not leap year" +year);

		}
			
	}
	
	@Test
	public void bb() {
		String s="te$tt@ntr@";
		s=s.replace('$','s');
		s=s.replace('@', 'a');
   		System.out.println(s);
	}
	 @Test
	   public void xyz() {
		   String s="aabbcdddecaf";
//		   a3b2c2d3e1f1		
		   HashSet<Character> set =new HashSet<Character>();
		   for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		   for (Character ch : set) {
			   int count=0;
			   for (int i = 0; i < s.length(); i++) {
				   if (ch==s.charAt(i)) {
					count++;
				}
				
			}
			   System.out.print(ch+""+count);
			
		}
		   
	   }

	@Test
	public void consea() {
		String s="aabbcdddecaf";//a3b2c2d3e1f1
 		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for ( int j=0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)&&i>j) {
					break;			
					}
				else if(s.charAt(i)==s.charAt(j)) {
					count++;
 				}
			}
			if(count>0)
			System.out.print(s.charAt(i)+""+count);
		}
	}	
	@Test
	public void conse() {
		String s="aabbcdddecaf";
		//a2b2c1d3e1c1a1f1
		int j=0;
		for (int i = 0; i < s.length(); i=j) {
			int count=1;
			for (  j=i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				else {
					break ;
				}
			}
			System.out.print(s.charAt(i)+""+count);
		}
	}
	@Test
	public void PrintRepeatingCharactersInword() {
		String [] s= {"Application","Append","App","ramappa"};
		String s1="";
		for(int i=0;i<s[0].length();i++) 
		{
			boolean flag=true;
		    for(int j=1;j<s.length;j++) 
			{
				if(!s[j].contains(s[0].charAt(i)+""))
				{
					flag=false;
					break;
				}
			}
			if(flag) 
			{
				s1=s1+s[0].charAt(i);
			}
		}
		System.out.println("The common letters are:"+s1);
	}
	@Test
	public void osj() {
		String str = "a3b2c1d2c2a4";
		 for( int i=0; i<str.length(); i=i+2)
		 {
			 for( int j=0;j<str.charAt(i+1)-48; j++)
			 {
				 System.out.print(str.charAt(i));
			 }
		 }
	}
	@Test
	public void o() {
 				int n = 5;

				int counter = 1;
				//Loop to iterate over each row
				for(int i=1;i<=n;i++){
					//Loop to iterate over each column
					for(int j=1;j<=i;j++){
						System.out.print(counter+ " ");
						counter++; 
					}
					System.out.println();
				}
			}
		

	@Test
	public void pattern11() {
		int n = 5;
		int counter = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(counter+ " ");
				counter++;
  			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(counter + " ");
				counter++;
 			}
			System.out.println();

		}
	}
	@Test
	public void pattern111() {
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1+" ");

			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(i-j+1+" ");

			}
			System.out.println();
		}
		}
	@Test
	public void pattern121() {
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
		int n = 5;
		for (int i = 1; i <= n; i++) {
			
			
			for (int j = i ; j >= 1; j--) {
				System.out.print("*");

			}
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	@Test
	public void AddMiddleString() {
		String[] s = { "s", "sn", "sneh", "sneha", "snehap", "snehasp" };
		int middle = s.length / 2;
		LinkedList<String> lh = new LinkedList<String>();
		for (int i = 0; i < s.length; i++) {
			lh.add(s[i]);
		}
		lh.add(middle, "sne");
		System.out.println(lh);
	}

	// input: wlecom to expleo output: expleo to welcome
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

//inserting element inoto an array
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

	@Test
	public void arraya3b2cd2() {
		String str = "a3b2cd2c2cp2";
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

	@Test
	public void arrayaaabbcdd() {
		String str = "abcabcddacdd";
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
			if (count >=1) {
				System.out.print(ch + "" + count);

			}
		}

	}

	@Test
	public void appa() {

		String[] a = { "appalication", "appayya", "appaesg", "appa" };

		// Initialize the shortestString with the first element of the array
		String common = a[0];// application

		// Iterate through the array to find the shortest string
		for (int i = 1; i < a.length; i++) {// 3 2
			if (a[i].length() < common.length()) {
				// 4<11
				common = a[i];// appa
			}
		}

		// Print the shortest string
		System.out.println("Shortest String: " + common);
	}

	@Test
	public void aeiou() {
		char[] vowels = { 97, 101, 105, 111, 117 };

		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(vowels[j] + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void findfirstMaxnoinArraywithoutusingbbsort() {
		int[] a = { 7, -3, 0, 2, 1, -9, 12 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(" the first max no in an array is " + max);

	}

	@Test
	public void prgm() {

		HashSet<Integer> inputSet = new HashSet<>();
		inputSet.add(2);
		inputSet.add(3);
		inputSet.add(7);
		// Find and print missing numbers
		System.out.print("Missing numbers: ");
		for (int i = 1; i <= 10; i++) {
			if (!inputSet.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}

	@Test
	public void prglm1() {
		String input = "aabcbbdeaa";
		// aa ab bc cb bb bd de ea aa
		System.out.println("Input string: " + input);
		System.out.println("Substrings of length " + 2 + ":");

		for (int i = 0; i <= input.length() - 2; i++) {
			String substring = input.substring(i, i + 2);
			System.out.print(substring + " ");
		}
	}

	@Test
	public void prgm3() {
		// I/p= my name is Radha O/p=mynameisRadha
		String s = "my name is Radha";
		String[] ss = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i]);
		}

	}

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

	@Test
	public void prgmm4() {
		String s = "education";// idacetoun
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

	/**
	 * String S1= "ABC"; String S2= "xyz"; String S3= "xyz"; How many objects will
	 * be created? three String objects will be created, but the third one will
	 * reuse the existing "xyz" object from the string pool.
	 */
	@Test
	public void pub7() {
		String str = "java234str789";
		String p = str.replaceAll("[^0-9]", "");
		String pp = str.replaceAll("[^a-z]", "");
		System.out.println(p);
		System.out.println(pp);

	}
	 
	@Test
	public void prgmmm() {
		String input = "update.decline.accept.include";
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '.') {
				result = result + ' '; // Replace dot with space
			} else {
				result = result + (ch);
			}
		}

		System.out.println("String with dots replaced by spaces: " + result);

		// Count the occurrences of 'c' in the string
		int count = 0;
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == 'c') {
				count++;
			}
		}

		System.out.println("Count of 'c' in the string: " + count);

		// Print characters along with their count
		System.out.println("Characters and their counts:");
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			int charCount = 0;

			// Count the occurrences of the current character
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == ch) {
					charCount++;
				}
			}

			// Avoid duplicate printing of characters
			if (i == result.indexOf(ch)) {
				System.out.println(ch + ": " + charCount);
			}
		}

	}

	@Test
	public void anagram() {
		String str1 = "cat";
		String str2 = "act";
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

	@Test
	public void prgmmmmm() {
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s2);

	}

	@Test
	public void pp1() {
		int[] input = { 2, 3, 4, 5, 1 ,7};
 
		int n = input.length;
		System.out.println(n);
		int[] output = new int[n];

		for (int i = 0; i < n; i++) {
			int newPosition = (i + 1) % n; // Calculate the new position after rotation
			output[newPosition] = input[i]; // Place the element in the new position
		}

		System.out.println(Arrays.toString(output));
	}

	@Test
	public void prgm4() {
		System.out.println('A' + 'B');
		System.out.println(10 + 20 + "chandan");
	}

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

	@Test
	public void pub() {
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

	@Test
	public void paub() {
		String str = "abcdehjh";
		String str1 = "1234";
		String output = "";
		int len1 = str.length();// 5
		int len2 = str1.length();// 4
		int i = 0, j = 0;

		while (i < len1 || j < len2) {
			if (i < len1) {
				output = output + str.charAt(i);
			}
			if (j < len2) {
				output = output + str1.charAt(j);
			}
			i++;
			j++;
		}
		System.out.println(output);
	}

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

	// 4 Revesre the word today is friday input

	@Test
	public void reverseTheWordsInString() {
		String s = "today is friday"; // input
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}

 
	@Test
	public void product0fMax3Element() {

		int[] a = { 5, 3, 0, 1, 4 };
		int temp;
		int size = a.length;
		System.out.println(size);
		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}

			}
			// System.out.println(a[0]);
		}
		System.out.println(a[0] * a[1] * a[2]);

	}

//10 input -  " i am selenium" 0/p- m ui nelesmai

	@Test
	public void splitString() {
		// String s = "i am selenium";
		String s = "hi hello welcome";
		String[] s1 = s.split(" ");
		String rev = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			String s2 = s1[i];

			for (int j = s2.length() - 1; j >= 0; j--) {
				rev = rev + s2.charAt(j);
			}

		}
		for (int j = 0; j < rev.length(); j++) {
			if (j == 2 || j == 5) {
				System.out.print(rev.charAt(j) + " ");
			} else {
				System.out.print(rev.charAt(j));
			}
		}
	}

	@Test
//11
	public void codeTryCatch() {
		try {
			// Code that may throw an exception
			int result = 10 / 0;
			System.out.println("Result: " + result); // This line will not be reached
		} catch (ArithmeticException e) {
			// Handle the exception
			System.err.println("An ArithmeticException occurred: " + e.getMessage());
		} finally {
			// Code that will always execute, whether an exception is occured or not
			System.out.println("Finally block executed.");
		}

		// Rest of the program continues here
		System.out.println("Program continues after try-catch-finally block.");
	}

	@Test

	public static int abc() {
		try {
			return 5;
		}

		catch (Exception e) {

		}
		return 10;

	}
//14 print all the 1-20 numbers divisible by 2

	@Test

	public void evenNumber() {
		int n = 20;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
//16 print 1-100 prime number

	@Test
	public void printPrimeNumber() {
		int n = 100;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % 2== 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i + " ,");
			}
		}
	}

//18 write a program to sort an array

	@Test
	public void sortAnArray() {
		int[] a = { 15, 34, 23, 12, 67, 43 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

//19 input -Malayalam output is m:2a:4l:2y:1

	@Test
	public void printString() {
		String str = "Malayalam";
		String s1 = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for (Character m : set) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (m == s1.charAt(i)) {
					count++;
				}
			}
			System.out.print(m + "=  " + count + "  ");
		}
	}
//20 write a program to find first min three element in array

	@Test
	public void first3MinimumNoInArray() {
		int[] a = { 7, -3, 0, 2, 1, -9 };
		int temp;
 		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

	}

//22 print the no of times character is present in string

	@Test

	public void occuranceOfEachCharecter() {
		String s = "Testyantra";

		char ch[] = s.toCharArray();
		HashSet<Character> hs = new HashSet<>();

		for (int i = 0; i < ch.length; i++) {
			hs.add(ch[i]);
		}
 		// int count=0;
		for (char m : hs) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (m == s.charAt(j)) {
					count++;

				}
			}
			System.out.println(m + "     Occurence    " + count);

		}
	}
// 29 input "aabbaa" 

	@Test
	public void removeduplicatetString() {
		String s = "aabbaa";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for (Character op : set) {
			System.out.print(op + " ");
		}
	}

//33 program to remove white space and replace it with a comma

	@Test
	public void replacewithComma() {

		{
			String str = "my name is arshad";
			String result = str.replaceAll("\\s+", ",");

			System.out.println("Original String is: " + str);
			System.out.println("Modified String is: " + result);
		}

	}
//34 java program for taking input in arraylist and returning in array

	@Test

	public void takingInputInArray() {
		int a[] = { 12, 13, 15, 34, 76, 23 };
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);

		}

		System.out.println(al);

	}

	@Test

	public void test() {
		int i = 20;
		int j = 30;
		System.out.println(i);
	}

	@Test

	public void reverseStringSub() {
		String str = "i am in ooty";
		String[] ss = str.split(" ");
 		for (int i = 0; i < ss.length; i++) {
			String s = ss[i]+" ";
			for (int j = s.length()-1; j>=0; j--) {
				System.out.println(s.charAt(j));
			}
		}
		 
//		String[] s1 = str.split(" ");
//		StringBuilder rev = new StringBuilder();
//		for (String word : s1) {
//			StringBuilder reversedWord = new StringBuilder();
//			for (int i = word.length() - 1; i >= 0; i--) {
//				reversedWord.append(word.charAt(i));
//			}
//			rev.append(reversedWord).append(" ");
//		}
//		String outputString = rev.toString().trim();
//		System.out.println("Input String: " + str);
//		System.out.println("Output String: " + outputString);
	}
//48 education wap to print vowels

	@Test
	public void printVowels() {
		String str = "education";
		int count = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.println(ch);
			}
		}
		System.out.println(count);
	}

	@Test
//49 pattern program
	public void pattern2() {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (char ch = 'A'; ch <= 'A'+i-1  ; ch++) {
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
		}
	}
//52 AFgaDFkGd bsed on ascii value which is greatest character which is repeated more times

	@Test
	public void basedOnAsciiGreatestCharacter() {
		String inputString = "AfgaDFkGd";
		int[] charCount = new int[128];
		for (char c : inputString.toCharArray()) {
			charCount[c]++;
		}
		char maxAsciiChar = 0;
		int maxCount = 0;
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > maxCount) {
				maxCount = charCount[i];
				maxAsciiChar = (char) i;
			}
		}
		System.out.println("Input String: " + inputString);
		System.out.println("Character with greatest ASCII value: " + maxAsciiChar);
		System.out.println("Occurrences of the character: " + maxCount);
	}

	@Test
//53

	public void missingElementsInArray() {
		int[] arr = { 1, 2, 4, 6, 7, 9 };
		int n = 10;
		Arrays.sort(arr);
		int current = 1;
		System.out.print("Missing elements: ");
		for (int num : arr) {
			while (current < num) {
				System.out.print(current + " ");
				current++;
			}
			current++;
		}
		while (current <= n) {
			System.out.print(current + " ");
			current++;
		}
		System.out.println();
	}
//54 frequency of odd and even numbers in the given matrix

	@Test
	public void getFrequencyOfOddEvenNumbersInGivenMatrix() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int oddCount = 0;
		int evenCount = 0;
		for (int[] row : matrix) {
			for (int num : row) {
				if (num % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println("Frequency of even numbers: " + evenCount);
		System.out.println("Frequency of odd numbers: " + oddCount);
	}
//87 string program 

	@Test
	public void verifyString() {

		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s2);
//false

	}

	@Test
//67
	public void outputFormat() {
		int[] arr = { 3, 4, 5, 6 };
		int target = 7;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Indices: " + i + ", " + j);
					return;
				}
			}
		}
		System.out.println("No such pair found.");
	}

	@Test
//68
	public void outputFormat2() {
		int[] a = { 7, 2, 12, 15 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int complement = target - a[i];
			if (map.containsKey(complement)) {
				int j = map.get(complement);
				System.out.println("Index I: " + j + ", Index J: " + i);
				return;
			}
			map.put(a[i], i);
		}
		System.out.println("No such indices found.");
	}
//72 print repeated digits in given 

	@Test
	public void repeatedDigits() {
		System.out.println("Repeated Digit Numbers from 0 to 100:");
		for (int i = 11; i <= 99; i++) {
			int tensDigit = i / 10;
			int unitsDigit = i % 10;
			if (tensDigit == unitsDigit) {
				System.out.print(i + " ");
			}
		}
	}
//73 fibnocci series print the number divisible by 3 and5

	@Test
	public void fibonaciSeries() {
		int n = 20;
		int[] fibonacci = new int[n];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		System.out.println("Fibonacci Series (First " + n + " numbers):");
		System.out.print(fibonacci[0] + " ");
		System.out.print(fibonacci[1] + " ");
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			if (fibonacci[i] % 3 == 0 && fibonacci[i] % 5 == 0) {
				System.out.print(fibonacci[i] + " ");
			}
		}
	}
//74print the table for user entered number

	@Test
	public void printTable() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("Multiplication Table for " + number + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + (number * i));
		}
		scanner.close();
	}

//78,79, Sop(15+35+"chandan") tell me the output

	@Test
	public void sop() {
		System.out.println('A'+'B');
		// Output is 131

		System.out.println(15 + 35 + "Chandan");
		// output is 50chandan

	}

	@Test

	public void outPut() {
		String str = "java234str789";
		String str1 = str.replaceAll("[^0-9]", "");
		System.out.println(str1);
		// Output is 234789
	}
//83 String s=hello find charcter occurence using map

	@Test

	public void characterOccurrence() {
		String s = "hello";
		String s1 = s.toLowerCase();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			lhm.put(s1.charAt(i), i);
		}
		for (Entry<Character, Integer> m : lhm.entrySet()) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (m.getKey() == s1.charAt(i)) {
					count++;
					lhm.put(m.getKey(), count);
				}
			}
			System.out.println(m.getKey() + " is repeating  " + count + " times");
		}
	}
//find the count of each number(by using map optimized)

	@Test
	public void optimizedOccurrence() {
		String s = "aaabbbccceeegggfff";
		String s1 = s.toLowerCase();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			lhm.put(s1.charAt(i), i);
		}
		for (Entry<Character, Integer> m : lhm.entrySet()) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (m.getKey() == s1.charAt(i)) {
					count++;
 				}
			}
			System.out.println(m.getKey() + " is repeating  " + count + " times");
		}
	}

	@Test

	public void checkString() {
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1 == s2);
	}

//88 reverse each word in string
	@Test
	public void reverseEachWord() {
		String str = "my name is anusha";

		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String s1 = s[i];
			for (int j = s1.length() - 1; j >= 0; j--) {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}

	@Test
//89write a program to find factorial of a number

	public void factorilNumber() {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

	@Test
//90 count occurence of string "The grass is green"
	public void OccurenceOfString() {
		String s = "The grass is green the green";
		String[] str = s.split(" ");
		HashSet<String> hs = new HashSet<>();

		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		System.out.println(hs);
		// int count=0;
		for (String m : hs) {
			int count = 0;
			for (int j = 0; j < str.length; j++) {
				if (m.equalsIgnoreCase(str[j])) {
 
					count++;
				}
			}
			System.out.println(m + "     Occurence    " + count);

		}
	}

	@Test
//91 swap to number without using 3rd variable
	public void swapNumberwithout3rdVar() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	@Test

//96 count each digit 12345
	public void countEachDigit() {

		int number = 12345555;
		int[] digitCount = new int[10]; // Array to store the count of each digit

		// Convert the number to a string to iterate through its digits
		String numberStr = Integer.toString(number);

		// Iterate through each character in the string
		for (int i = 0; i < numberStr.length(); i++) {
			char digitChar = numberStr.charAt(i); // Get the current character (digit)
			int digit = Character.getNumericValue(digitChar); // Convert character to integer

			// Increment the count for the current digit
			digitCount[digit]++;
		}

		// Display the count for each digit
		for (int i = 0; i < 10; i++) {
			if (digitCount[i] > 0) {
				System.out.println("Digit " + i + " occurs " + digitCount[i] + " times.");
			}
		}
	}

	@Test
//94 check the 2 string is anagram
	public void checkAnagram() {
		String str1 = "Race";
		String str2 = "Care";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

// check if length is same
		if (str1.length() == str2.length()) {

			// convert strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same
			// then the string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}

	}

	@Test
//95 pattern program
	public void pattern() {
		// dot
		int n = 4;
			for (int j = 1; j <= n; j++) {
				for (int i = n; i > 0; i--) {

				if (i <= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

//97pallindrome String madam

	@Test

	public void stringPallindrome() {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("it is a pallindrome string");
		} else {
			System.out.println("it is not a pallindrome string");
		}

	}

	@Test
	public void num() {
		int n = 1;
		int rows = 3;
		int colus = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colus; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();

		}
	}

}
