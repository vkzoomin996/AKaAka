package Collection;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Set {
	@Test
	public void set() {
		HashSet<Object> set= new HashSet<>();
		set.add(12);
		set.add(12);
		set.add("ram");
		set.add(1);
		set.add(18);
		set.add("rm");
		set.add('r');
		

		
		System.out.println(set);
		
	}

}
