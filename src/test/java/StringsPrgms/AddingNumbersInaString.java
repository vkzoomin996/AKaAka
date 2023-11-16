package StringsPrgms;

import org.testng.annotations.Test;

public class AddingNumbersInaString {
	@Test
	public void addingNumbersInaString() {
		String s="1he2m4";//7
		int sum=0;//0 1 3 7
		for (int i = 0; i < s.length(); i++)
			
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				sum=sum+n;
				
			}
			
		}
		System.out.println(sum);
	}

	 
}
