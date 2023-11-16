package Javapack;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class RemoveduplicatesinArrayusingcollection {
	@Test
public void removeduplicatesinArrayusingcollection() {
		int[] a = {2,3,1,4,1,3,5,2,9,10};
	//LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
 		HashSet<Integer> set= new HashSet<Integer>();
		//TreeSet<Integer> set= new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
	
}
	@Test
public void removeduplicatesinArrayusingcollection1() {
		int[] a = {2,3,1,4,1,3,5,2,9,10};
		LinkedHashMap<Object,Object> map= new LinkedHashMap<Object,Object>();
 		for (int i = 0; i < a.length; i++) {
			map.put(a[i],i);
		}
 		for(Entry<Object,Object> m:map.entrySet()) {
 			System.out.println(m.getKey()+" ");
 		}
	
}
	@Test
	public void removeduplcatewithoutusingcollection() {
		String s="veeresha";
		char[] ch = s.toCharArray();
 		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(s.charAt(i)==s.charAt(j) &&i>j) {
					break;
				}else if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				
			}

			if(count>=1) {
				System.out.println(s.charAt(i));
			}
		}
	 
			
			
		
				}
	}

