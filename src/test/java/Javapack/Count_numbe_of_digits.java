package Javapack;

import org.testng.annotations.Test;

public class Count_numbe_of_digits {
	public static void main(String[] args) {
		int num =1234567;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
 
		}
		System.out.println(count);//7
	} 
	@Test
	public void bench() {

		String s = "abcde";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {

			count++;
		}
		System.out.println(count);
	}

}


