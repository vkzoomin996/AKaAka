package Javapack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import org.apache.commons.collections4.ArrayStack;
import org.testng.annotations.Test;

public class Reverse {
	@Test
	public void   reverse() {
		String str="Test Automation central";
		//central Automation Test
		String rev="";
		String[] s = str.split(" ");
		for (int i = s.length-1; i >=0 ; i--) {
			rev=rev+s[i]+" ";
		}
		System.out.println(rev);
	}
	@Test
	public void   reversea() {
		String str="Test Automation central";
		//tseT noitamotuA lartnec
		String[] s = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String ss = s[i]+" ";
			for (int j = ss.length()-1; j >=0 ; j--) {
				System.out.print(ss.charAt(j));
			}
		}
}
	@Test
	public void    StringImmutable() {
		String s="ABC";
		 s.concat("DEF");
				System.out.println(s);
		 
 	}
	@Test
	public void  countnum() {
		int num=1234124;
		int aa = String.valueOf(num).length();
		System.out.println(aa);
		
		
		
	}
	
	@Test
	public void  countnuma() {
		int num=1234124;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 		while(num>0) {
			int r = num%10;
			if(map.containsKey(r))
			{
				map.put(r, map.get(r)+1);
				
			}else {
				map.put(r, 1);
				
			}
			num=num/10;

		}
 		System.out.println(map);


	}
	@Test
	public void  asciivalueforeachchar() {
		String s="veeresha";
		char[] aa = s.toCharArray();
		for(char ch: aa) {
			System.out.println(ch+"  "+(int)ch);
			
		}
	
 }
	@Test
	public void  how_to_control_String_to_numvale() {
		String s="123456";
int aa = Integer.parseInt(s);
System.out.println(aa);
	}
	@Test
	public void  how_to_control_num_to_String() {
		int s=123456;
	String ss = String.valueOf(s);
System.out.println(ss);
	}
	@Test
	public void  find_the_numof_worlds_ina_String() {
		String s="welcome to my world";
		System.out.println(s.length());
		String[] sss = s.split(" ");
 		System.out.println(sss.length);
	}
	@Test
	public void remove_vowels_from_String() {
	String s="iAmA vEereshA";
	String vowels="aeiouAEIOU";
	String op="";
	char[] ch = s.toCharArray();
	for (char c : ch) {
		if(vowels.indexOf(c)==-1) {
		
		op=op+c;
	}
}
	System.out.println(op);

	}
	@Test
	public void count_uppercase_ina_string() {
		String s="iam verEEshS HHGFG ";
		char[] ss = s.toCharArray();
		int count=0;
		for (char c : ss) {
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void how_to_remove_spl_char_string() {
		String s="abc@#$%*()";
		String ss = s.replaceAll("[^A-za-z0-9]", "");
		System.out.println(ss);
	}
	
}



























