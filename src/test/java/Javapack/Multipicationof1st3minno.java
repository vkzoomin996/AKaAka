package Javapack;

import org.testng.annotations.Test;

public class Multipicationof1st3minno {
	@Test
	public void multipicationof1st3minno() {
	
		int[] a= { 20,12,70,56,14};
 		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				
		 if(a[i]>a[j]) {
			int  temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
 
	}
 	}
		int mul=1;
		for(int i=0; i<3; i++){
			mul=mul*a[i];
		}
		System.out.println(mul);

}
	}


