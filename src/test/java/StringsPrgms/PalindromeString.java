package StringsPrgms;

import org.testng.annotations.Test;

public class PalindromeString {
	@Test
	public void palindromeString() {
		String s="gadag";
		String revstring="";
		for(int i=s.length()-1; i>=0; i--)
		{
			revstring=revstring+s.charAt(i);
		}
		System.out.println(revstring);
 		if(revstring.equalsIgnoreCase(s)) {
			System.out.println("given "+s+  "     is pallindrome");
		}else {
			System.out.println("given "+s+"     is  not a pallindrome");

		}

}
	
}