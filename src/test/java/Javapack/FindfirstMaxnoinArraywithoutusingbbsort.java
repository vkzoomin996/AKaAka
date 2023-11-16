package Javapack;

import org.testng.annotations.Test;

public class FindfirstMaxnoinArraywithoutusingbbsort {
	@Test
	public void findfirstMaxnoinArraywithoutusingbbsort() {
		int[] a= {5,3,8,9,10};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(" the first max no in an array is "+max);

}
	
}