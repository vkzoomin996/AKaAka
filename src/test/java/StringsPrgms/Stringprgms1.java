package StringsPrgms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Stringprgms1 {
	@Test
	public void occurenceofeachcharinString() {
		String s="I am from am from TestYantra";
   			HashMap<Character, Integer> map= new HashMap<Character, Integer>();
			char[] chars = s.toCharArray();
			for (char c : chars) {
				if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer value = map.get(c);
				map.put(c, value+1);
			}
			
		}
			System.out.println(map);}
	@Test
	public void removeduplicatefromstring() {
		String s="I am from am from TestYantra";
		Set<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			System.out.println(character);
		}

		}
	 @Test
		public void countnoofDuplicatesInanString() {
			String s="I am from am from TestYantra";
			//HashSet<Integer> set= new HashSet<Integer>();
			LinkedHashSet<Character> set= new LinkedHashSet<Character>();

			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
			for (Character ch : set) {
	 			int count=0;
				for (int i = 0; i <s.length(); i++) {
					if (ch==s.charAt(i)) {
						count++;
						
					}
				}
				if(count>1) {
				System.out.println(ch+" is repeating  " +count+"times");
			}
				
			}
	 }
	 @Test
		 public void CharacterPosition() {
			String s="I am from am from TestYantra";
		        
		        for (int i = 0; i < s.length(); i++) {
		            char currentChar = s.charAt(i);
		            int position = i + 1;  
		            
		            System.out.println("Character: " + currentChar + ", Position: " + position);
		        }
 }
		}

		
		
		
	

