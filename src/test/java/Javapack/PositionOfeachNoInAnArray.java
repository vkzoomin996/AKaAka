package Javapack;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfeachNoInAnArray {
	@Test
	public void positionOfeachNoInAnArraywithoutDuplicate() {
		int[] a = {2,3,1,4,1,3,5,2,2};
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
		set.add(a[i])	;
		
		}
		for (Integer integer : set) {
			for (int i = 0; i <a.length; i++) {
				if (integer==a[i]) {
					System.out.println(integer+"   "+(i+1)+" ");
					break;
				}
			}
			
		}
		
	}
	@Test
	public void positionOfeachNoInAnArraywithoutDuplicate1() {
		int[] a = {2,3,1,4,1,3,5,2,2};
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i],a[i]);
		}
		for (Integer integer : map.values()) {
			for (int i = 0; i < a.length; i++) {
				if (integer==a[i]) {
					System.out.println(integer+"   "+(i+1));
					break;
				}
			}
			
		}
		
	}}

