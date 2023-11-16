package Javapack;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Arraya3b2cd2 {
	@Test
	public void arraya3b2cd2() {
		String str = "a3b2cd2e4f";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch < 'Z' || ch >= 'a' && ch < 'z') {
				System.out.print(ch);

			} else {
				
 				int x = Character.getNumericValue(ch);
 
				for (int j = 1; j < x; j++) {

					System.out.print(str.charAt(i-1));
				}
			}

		}
	}
	@Test
	public void arrayaaabbcdd() {
		String str="aaabbcddeaa";
		String s=str.toLowerCase(); 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			 
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
			{
				count++;
			}
				}
  				System.out.print(ch+""+count);

				
			
		}
		
	}}
		 