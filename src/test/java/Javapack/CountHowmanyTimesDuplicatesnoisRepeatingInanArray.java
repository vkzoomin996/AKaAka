package Javapack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CountHowmanyTimesDuplicatesnoisRepeatingInanArray {

	@Test
	public void countHowmanyTimesDuplicatesnoisRepeatingInanArray() {
		int[] a= {2,3,1,4,1,3,5,2};
		//HashSet<Integer> set= new HashSet<Integer>();
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			System.out.println(integer);
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (integer==a[i]) {
					count++;
					
				}
			}
			System.out.println(integer+" is repeating  " +count+"times");
 
		}
		 
}
	
	@Test
	public void countHowmanyTimesDuplicatesnoisRepeatingInanArray1() {
		int[] a= {2,3,1,4,1,3,5,2};
	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(int i=0; i< a.length; i++){
 
  
         map.put(a[i],a[i]);
         }
	    for (int nm : map.values()) {
 			int count=0;
			 for (int i = 0; i < a.length; i++) {
				if(nm==a[i]) {
					count++;
			}
		}

          System.out.println(nm+"repeating "+count+"times");
	    }}}