package StringsPrgms;

import org.testng.annotations.Test;

public class Reversearray {
	@Test
	public void reversearray() {
		  String str[]={"pawan","veeres","raghu","akkir"};
	        
			 for(int i=str.length-1;i>=0;i--){
			     String s=str[i]+" ";
 			     for(int j=s.length()-1;j>=0;j--){
			   
			    	 System.out.print(s.charAt(j));
			 }
			 }
	}
}

