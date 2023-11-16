package Javapack;

import org.testng.annotations.Test;

public class secindmax {

	@Test
	public void secindmin() {
		int[] a= {3,5,0,1,9,10};
		int fmin=a[0];
		int smin=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<fmin) {
				int temp=fmin;
				fmin=a[i];
				a[i]=temp;}
			else if(a[i]<smin) {
				int temp1=smin;
				smin=a[i];
				a[i]=temp1;
			}
		}
 System.out.println(fmin);			
 System.out.println(smin);			

		}
	@Test
	public void secindmax() {
		int[] a= {3,5,0,1,9,10};
		int fmax=a[0];
		int smax=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>fmax) {
				int temp=fmax;
				fmax=a[i];
				a[i]=temp;
				}
			else if(a[i]>smax) {
				int temp1=smax;
				smax=a[i];
				a[i]=temp1;
			}
		}
 System.out.println(fmax);			
 System.out.println(smax);			

		}
		}
	
