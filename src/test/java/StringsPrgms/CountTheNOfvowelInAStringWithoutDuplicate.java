package StringsPrgms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CountTheNOfvowelInAStringWithoutDuplicate {
@Test
public void  countTheNOfvowelInAStringWithoutDuplicate() {
	String str="veeresha";
	 String s = str.toLowerCase();
	 LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	 for (int i = 0; i < s.length(); i++) {
		 set.add(s.charAt(i));
 	}
	 int count=0;
	 for (Character ch : set) {
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			 count++;
			 System.out.println(ch);
		 }
		
	}
	 System.out.println(count);
}}
	 