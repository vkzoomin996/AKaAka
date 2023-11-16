package Javapack;

import java.util.Iterator;
 
import org.testng.annotations.Test;

public class Appending0satlast {
	@Test
	public void Appending0satlast() {
		int[] a= {5,0,4,0,0,9}; //o/p 5,4,9,0,0,0
		int[] b= new int[a.length];
		int m=0;
		int n=a.length-1;//5
		for (int i = 0; i < a.length; i++) {
			if ( a[i]!=0) //5!=0
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
				
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}	
		}
		
	}