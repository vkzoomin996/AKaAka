package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class List_to_set {
	@Test
	public void list_to_set() {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("veeru");
		arraylist.add("java");
		arraylist.add("veeru");
		arraylist.add("java");
		System.out.println(arraylist);
		HashSet strSet = new HashSet<>(arraylist);
		System.out.println(strSet);
	}
	@Test
	public void set_to_list() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(5);
		set.add(7);
		System.out.println(set);
		ArrayList list = new ArrayList<Integer>(set);
		System.out.println(list);
	}

}
