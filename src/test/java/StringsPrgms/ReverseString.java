package StringsPrgms;

import org.testng.annotations.Test;

public class ReverseString {
 
	@Test
	public void reverseString() {
		String s="Banglore"; //erolgnab
		String rev="";
		for (int  i =s.length()-1; i>=0; i--) {

            rev=rev+s.charAt(i);
 		}
		System.out.println(rev);

		
		
	}
	@Test
	public void reverseStringwithmultiplewords() {
		String s="I am from am from TestYantra";
		String[] words = s.split( " ");
 		String revString="";
		for (int i = 0; i < words.length; i++) {
			String word=words[i];
			String revword="";
			for (int  j=word.length()-1; j>=0; j--) {
				revword=revword+word.charAt(j);
			}
			revString=revString+revword+" ";
			
				
			}
		System.out.println(revString);
		}
 
  	
	@Test
	public void reverseString1() {
		String s="Banglore"; //erolgnab
		System.out.println(s);
		char[]str =s.toCharArray();
 		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
System.out.println();
	}
	@Test
	public void reverseString2() {
		String s="Banglore";
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}
		
	@Test
	public void reverseString3() {
		String s="Banglore";
		char[] str =s.toCharArray();
		int count =0;
		for (char c : str) {
			count++;
		}
		for(int i=count-1; i>=0; i--)
		{
			System.out.println(str[i]);
		}
		}
		
		
	@Test
	public void reverseString4() {
		String s="Banglore";

		StringBuilder sb=new StringBuilder(String.valueOf(s));
		//StringBuffer s=new StringBuffer("I am from am from TestYantra");
 		System.out.println(sb.reverse());
	}
 	
	}
