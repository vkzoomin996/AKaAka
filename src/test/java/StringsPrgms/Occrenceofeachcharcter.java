package StringsPrgms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occrenceofeachcharcter {
	@Test
	public void occrenceofeachcharcterusinghashset() {
		String str="TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character character : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {
					count++;
					
				}
				
				
			}
 			System.out.println(character+"is repeating "+count+"times");
 	}}
	@Test
	public void occrenceofeachcharcterusingmap() {
		String str="TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashMap<Character, Object> map=new LinkedHashMap<Character, Object>();
		
			for (int i = 0; i < s.length(); i++) {
				map.put(s.charAt(i), i);
			}
			for (Entry<Character,Object> m : map.entrySet()) {
 int count=0;
 for (int i = 0; i < s.length(); i++) {
	if (m.getKey()==s.charAt(i)) {
		count++;
	}
}
 System.out.println(m.getKey()+"is repeating "+count+"times");
			}
				
			}
			
		
	@Test
	public void occrenceofeachcharcterusinghashset1() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character character : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)) {
					count++;
					
				}
				
				
			}
			System.out.println(character+"is repeating "+count+"times");
		}
	}
	@Test
	public void occrenceofeachcharcterusingmap1() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashMap<Character, Object> map=new LinkedHashMap<Character, Object>();
		
			for (int i = 0; i < s.length(); i++) {
				map.put(s.charAt(i), i);
			}
			for (Entry<Character,Object> m : map.entrySet()) {
 int count=0;
 for (int i = 0; i < s.length(); i++) {
	if (m.getKey()==s.charAt(i)) {
		count++;
	}
}
 System.out.println(m.getKey()+"is repeating "+count+"times");
			}
				
			}
	
 
}

	


