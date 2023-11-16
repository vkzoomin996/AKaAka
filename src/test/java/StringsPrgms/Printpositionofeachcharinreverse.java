package StringsPrgms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Printpositionofeachcharinreverse {
	@Test
	public void printpositionofeachcharinreverse() {
		String str="Tester";
		String s = str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			for (int i = s.length()-1; i>=0; i--) {
				if (ch==s.charAt(i)) {
					System.out.println(ch+"is in "+(i+1)+"position");
 				}
				
			}
			
		}
	}
		@Test
		public void printpositionofeachcharinreversemap() {
			String str="Tester";
			String s = str.toLowerCase();
			
			LinkedHashMap<Character, Object> map= new LinkedHashMap<Character, Object>();
			for (int i = 0; i < s.length(); i++) {
				map.put(s.charAt(i), i);
			}for (Entry<Character,  Object> m : map.entrySet()) {
				for (int i = s.length()-1; i>=0; i--) {
					if (m.getKey()==s.charAt(i)) {
						System.out.println(m.getKey()+"is in"+(i+1)+"position");
  					}

		 
						
					}
					
				}
				
			}
	}


