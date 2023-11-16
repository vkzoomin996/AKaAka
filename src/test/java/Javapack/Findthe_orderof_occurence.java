package Javapack;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Findthe_orderof_occurence {
	@Test
	public void findthe_orderof_occurence_of_number() {
		int n=1223223;
 		HashMap<Integer,Integer> map= new HashMap<>();
		while(n>0) {
			int r=n%10;
			if(map.containsKey(r))
			{
				map.put(r, map.get(r)+1);
			}else
			{
				map.put(r, 1);
				
			}
			  n=n/10;
		}
		  System.out.println(map);

		
	}

}
