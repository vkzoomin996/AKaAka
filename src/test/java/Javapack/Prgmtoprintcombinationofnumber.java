package Javapack;

import org.testng.annotations.Test;

public class Prgmtoprintcombinationofnumber {
	@Test
	public void prgmtoprintcombinationofnumber() {
		int[] a= {8,4,3,9,2,7,5,6};//11
 		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==11) {
					System.out.println(a[i]   +"          "+a[j]);
 				}
			}

			}
		
 		}
		
 
	
 	
 }
