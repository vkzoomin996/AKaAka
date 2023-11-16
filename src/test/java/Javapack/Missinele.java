package Javapack;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Missinele {
	@Test
	public void missinele() {
		int[] a= {1,3,5};
		int size=5;
		ArrayList<Integer> aa=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			aa.add(a[i]);
		}
			
 	 for (int i = 1; i <=size; i++) {
 			 
		if(!aa.contains(i)) {
			System.out.println(i);
			
		}
		
	}
	
}		
	}


