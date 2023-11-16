package Collection;

import org.testng.annotations.Test;

public class  kk {
@Test
public void how_to_find_Length_without_length_method() {
	int count=0;
 		 String s="banglore";
 		char[] ch = s.toCharArray();
 		System.out.println(ch);
 		for (char c : ch) {
 			count++;
		}
 		System.out.println(count);
	}
	
}

