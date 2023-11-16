package Javapack;

import org.testng.annotations.Test;

public class FirstmininArray {
	@Test
	public void firstmininarray() {
		
		int[] a= { 20,12,70,56,14};
 		for(int i=0;i<a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					 int  temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }	}

	}
        System.out.println("First min element present in given array: " + a[0]);  

	}}

