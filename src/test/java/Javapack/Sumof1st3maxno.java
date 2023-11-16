package Javapack;

import org.testng.annotations.Test;

public class Sumof1st3maxno{
	@Test
	public void sumof1st3maxnousingbubblesort() {
		
		int[] a= { 20,12,70,56,14};
		int temp =0;
		for(int i=0;i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				
		 if(a[i]<a[j]) {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
 
	}
 	}
		int sum=0;
		for(int i=0; i<3; i++){
			sum=sum+a[i];
		}
		System.out.println(sum);

}
}


