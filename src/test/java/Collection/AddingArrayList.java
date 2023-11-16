package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class AddingArrayList {
	 

	//public  void addingArrayList (){
	  public static  void main(String[] args) {
		
	
		ArrayList<Object> a= new ArrayList<>();
 		a.add(",");
		a.add(3.4);
		a.add('r');
		a.add("");
		a.add(null);
		a.add("veeresha");
 		a.add(12);
 		a.remove(0);
		System.out.println("  "+a);
		a.contains(12);
 		a.remove("veeresha");
		a.remove(4);
		System.out.println("  "+a.contains(12));
		System.out.println(a);
		ArrayList<Object> a1= new ArrayList<>();
		a1.add(10);
		a1.add(3.4);
		a1.add('r');
		a1.add("");
		a1.add(null);
		a1.add("veeresha");
 		a1.add(12);
 		System.out.println(" "+a1);
 		a1.addAll(a);
 		System.out.println(a1);
 		a1.retainAll(a);
 		System.out.println(a1);
 		a1.removeAll(a);
 		System.out.println(a1);
 		a.clone();
 		System.out.println(a);


		
		
	

}
}