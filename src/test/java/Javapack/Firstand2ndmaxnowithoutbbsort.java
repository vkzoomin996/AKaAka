package Javapack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Firstand2ndmaxnowithoutbbsort {
	@Test
	public void firstand2ndmaxnowithoutbbsort() {
		int a[] = { 20, 25, 4, 6, 12 };
		int fmax = a[0];
		int smax = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= fmax)// 20>=20 , 25>=20 ,4>=25,6>=25,12>=25
			{
				if (a[i] != fmax)
					// 20!=20 ,25!=20
				{
					smax = fmax;// 20

				}
				fmax = a[i];// 20 , 25
			} else if (smax == fmax || smax < a[i])// 20==25 || 20<25
			{
				smax = a[i];// 20
			}
		}
		System.out.println(fmax);

		System.out.println(smax);

	}

	@Test
	public void firstand2ndmaxnowithoutbbsort1() {
		int a[] = { 20, 25, 4, 6, 12 };

		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			t.add(a[i]);
		}

		System.out.println(t);
		System.out.println(t.pollFirst());
		// System.out.println(t.pollLast());
		// t.pollFirst();
		// t.pollLast();
		System.out.println(t.pollFirst());
		// System.out.println(t.pollLast());

	}
	
	
	@Test
	public void firstand2ndmaxduplicate() {
 
 		        int[] a = {1, 3, 2, 4, 4, 5, 6, 7, 6};

		        // Create a HashSet to store duplicate values
		        HashSet<Integer> set = new HashSet<>();
		        
		        // Initialize variables for maximum and second maximum
		        int fmax = 0;
		        int smax = 0;

		        for (int num : a) {
  		            if (!set.add(num) ){
 		                if (num > fmax) {
		                	smax = fmax;
		                    fmax = num;
		                } else if (smax ==fmax || num < smax) {
		                	smax = num;
		                }
		            }
		        }

		        System.out.println("Duplicate values: " + set);
		        System.out.println("First Maximum in duplicates: " + fmax);
		        System.out.println("Second Maximum in duplicates: " + smax);
		    }
		}


