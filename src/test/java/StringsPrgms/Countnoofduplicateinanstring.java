package StringsPrgms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Countnoofduplicateinanstring {
	@Test
	public void countnoofduplicateinanstring() {
		String str="TestYantra";
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
			}}
			if(count>1) {
				System.out.println(ch+"is repeating "+count+"times");
			}
		}
		
	}
	@Test
	public void countnoofduplicateinanstringmap() {
		String str="TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashMap<Character,  Object> map=new LinkedHashMap<Character,  Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
 		}
		for (Entry<Character,  Object> m : map.entrySet()) {
 			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey()==s.charAt(i)) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(m.getKey()+"is repeating "+count+"times");
			}
		}
	}


	@Test
	public void countnoofduplicateinanstring1() {
		String str="I am from am from TestYantra";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
  		String s=str1.toLowerCase(); 
		
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
			}}
			if(count>1) {
				System.out.println(ch+"is repeating "+count+"times");
			}
		}
		
	}
	@Test
	public void countnoofduplicateinanstringmap1() {
		String str="I am from am from TestYantra";
		String str1 = str.replaceAll("\\s", "");
		String s=str1.toLowerCase(); 
		LinkedHashMap<Character,  Object> map=new LinkedHashMap<Character,  Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
 		}
		for (Entry<Character,  Object> m : map.entrySet()) {
			 
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey()==s.charAt(i)) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(m.getKey()+"is repeating "+count+"times");
			}
		}
	}

}
