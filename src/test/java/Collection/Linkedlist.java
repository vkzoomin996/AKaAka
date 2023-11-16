package Collection;

import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

public class Linkedlist {
	@Test
	public void linkedlist() {
	LinkedList a= new	LinkedList();
	a.addToHead(12);
	a.addToHead(124);
	a.addToTail(200);
	a.addToTail("ram bjai");
 

	System.out.println(a);
	a.removeHead();
 	System.out.println(a);
 	a.getHead();
 	a.getTail();
 	System.out.println(a);


	 
	}
}
