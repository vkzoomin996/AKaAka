package Javapack;

import org.testng.annotations.Test;

public class Secondminarray {
	@Test
	public void secondmininarray() {
		
		int[] a= { 20,12,70,56,14};
		int temp =0;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				
		 if(a[i]>a[j]) {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
 
	}
 	}
		 System.out.println(a[1]+" ");
}


}
