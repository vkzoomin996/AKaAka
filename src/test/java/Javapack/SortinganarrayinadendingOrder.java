package Javapack;

import org.testng.annotations.Test;

public class SortinganarrayinadendingOrder {
@Test
public void sortinganarrayindesendingOrder() {
	int[] a= {5,3,2,1,4};
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
 		}
		System.out.println(a[i]+"  ");

	}}}
	
	 