package Javapack;

import org.testng.annotations.Test;

public class FirstmaxArray {
	@Test
	public void firstmaxnonarray() {
		
		int[] a= { 20,12,56,70,14};
 		for(int i=0;i<a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			
		
			if(a[i]<a[j]) {
				 int  temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }	}

	}
        System.out.println("First max element present in given array: " + a[0]);  

	}}
