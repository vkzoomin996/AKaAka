package StringsPrgms;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class SecondLargestelementinanarraywithoutusingsorting {
	@Test
	public void secondLargestelementinanarraywithoutusingsorting() {
		TreeSet<Integer> t= new  TreeSet<Integer>();
		t.add(10);
		t.add(30);
		t.add(120);
		t.add(140);
		t.add(100);
		System.out.println(t);
		t.pollLast();
		System.out.println(t.pollLast());
		t.pollFirst();
		System.out.println(t.pollFirst());
	}

}
