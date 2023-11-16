package Javapack;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountnoofDuplicatesInanarrayUsingCollection {
    @Test
	public void countnoofDuplicatesInanarrayUsingCollection() {
    	int[] a= {2,3,1,4,1,3,5,2,2};
		//HashSet<Integer> set= new HashSet<Integer>();
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
 		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
 			int count=0;
			for (int i = 0; i <a.length; i++) {
				if (integer==a[i]) {
					count++;
 				}
			}
			if(count>1) {
			System.out.println(integer+" is repeating  " +count+"times");
		}
 }

    
    }}
