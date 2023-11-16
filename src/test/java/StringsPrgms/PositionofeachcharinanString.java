package StringsPrgms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class PositionofeachcharinanString {
	@Test
	public void positionofeachcharinanString() {
		String str="TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"is in"+(i+1)+"position");
					break;
				}
				
			}
			
		}

}
	@Test
	public void positionofeachcharinanStringmap() {
		String str="TestYantra";
		String s=str.toLowerCase();
		LinkedHashMap<Character, Object> map= new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for (Entry<Character,  Object> m : map.entrySet()) {
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey()==s.charAt(i)) {
					System.out.println(m.getKey()+"is in"+(i+1)+"position");
				}

				
				
			}
		}

			
		}
	@Test
	public void positionofeachcharinanString1() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase(); 
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) {
					System.out.println(ch+"is in"+(i+1)+"position");
					break;
				}
				
			}
			
		}

}
	@Test
	public void positionofeachcharinanStringmap1() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase();
		LinkedHashMap<Character, Object> map= new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i);
		}
		for (Entry<Character,  Object> m : map.entrySet()) {
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey()==s.charAt(i)) {
					System.out.println(m.getKey()+"is in"+(i+1)+"position");
				}

				
				
			}
		}

			
		}
}