package StringsPrgms;

import org.testng.annotations.Test;

public class ReverseGivenString {
	@Test
	public void reverseGivenString() {
		String sr="I am from Testyantra";
		String[] s = sr.split(" ");
  for (int i = 0; i < s.length; i++) {
	 String str=s[i]+" ";
	  
	 
 for (int j =  str.length()-1; j>=0;j--) 
 {
	 System.out.print(str.charAt(j));
	
}		
	} 
	 
	
}			
		
		
		
	}


