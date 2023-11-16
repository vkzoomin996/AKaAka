package StringsPrgms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occrence {
	
	@Test
	public void occrencewithcollection() {
		int[] a= {1,8,7,9,5,6,2,2,2,8,7};
		
		 HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		 for (int i = 1; i < a.length; i++) {
 map.put(a[i], a[i])	;	
		 
		 }
		 for(Integer nm:map.values()) {
			 int count=0;
			 for(int i=0; i<a.length; i++)		
			 {
				 if(nm==a[i]) {
					 count++;
				 }
			 }
			 System.out.println(nm+"occring "+count+"times");
		 }
		 
	}
		 @Test
			public void occrencewithcollection1() {
				int[] a= {1,8,7,9,5,6,2,2,2,8,7};
				
				 HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
				 for (int i = 1; i < a.length; i++) {
		 map.put(a[i], i)	;	
				 
				 }
				 for(Entry<Integer, Integer> po:map.entrySet()) {
					 int count=0;
					 for(int i=0; i<a.length; i++)		
					 {
						 if(po.getKey()==a[i]) {
							 count++;
						 }
					 }
					 System.out.println(po.getKey()+"occring "+count+"times");
				 }
				 
	}
	
	@Test
	
	public void occurence() {
		int[] a= {1,8,7,9,5,6,2,2,2,8,7,1};

		for (int i = 0; i < a.length; i++) {
			int count=0;

			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]&&i>j) {
				  break;
					 
				}else if(a[i]==a[j]) {
					count++;
				}
				
			}
			if(count>=1) {

		
		System.out.println(a[i]+"occring"+count+"times ");
			}

		}
		
	}
			
 	@Test
 	public void occrenc() {
 		String a="ababcd";
 		for (int i = 0; i < a.length(); i++) {
			int count=0;

			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)&&i>j) {
				  break;
					 
				}else if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
				
			}
			if(count>=1) {

		
		System.out.println(a.charAt(i)+"occring"+count+"times ");
			}

		}
		
	}
 	@Test
 	public void occrenc1() {
 		String[] a= {"i","iam", "iam","from", "iam" ,"from",""};
 
 		for (int i = 0; i < a.length; i++) {
			int count=0;

			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]&&i>j) {
				  break;
					 
				}else if(a[i]==a[j]) {
					count++;
				}
				
			}
			if(count>=1) {

		
		System.out.println(a[i]+"occring"+count+"times ");
			}

		}
		
	}

	@Test
	public void duplicates() {
		int[] a= {1,8,7,9,5,6,2,2,2,8,7};
		HashSet<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (Integer s : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(s==a[i]) {
					count++;
				}
				
			}
			if(count>1) {
			System.out.println(s+"duplicates"+count+" times");
			
		}}
 		
}
	@Test
	public void duplicatepositionrepeating_single_time() {
		int[] a= {1,8,7,9,5,6,2,2,2,8,7};
		HashSet<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (Integer s : set) {
   			for (int i = 0; i < a.length; i++) {
				if(s==a[i]) {
					
  			 			System.out.println(s+"  position " + (i+1) +  "  ");
						break;

				
 
 					}


 				
	
			}
			
		
		
}
}}