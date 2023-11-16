package StringsPrgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Findoccrenceofeachwordsinastringusingmap {
	@Test
	public void findoccrenceofeachwordsinastringusingmap() {

		String str = "testyantra";
		//String str1 = str.replaceAll("\\s", "");
		String s = str.toLowerCase();
//String[] st = s.split(" ");

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			// System.out.println(" "+st[i]);
		}

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}

			System.out.println(ch + "   is repeating " + count + " times");
		}
	}
	
	
 
}