package StringsPrgms;

import org.testng.annotations.Test;

public class Swap1srandlastWordInAString {
	@Test
	public void swap1srandlastWordInAString() {
		
		String str="I am from Testyantra";//Testyantra am from I
                 String[] s = str.split(" ");
                  //s[o]=I s[1]=am s[2]=from s[3]=TestYantra
                 String temp=s[0];
                 s[0]=s[s.length-1];
                 s[s.length-1]=temp;
                 for (int i = 0; i < s.length; i++) {
					System.out.println(s[i]+" ");
				}
	}

}
