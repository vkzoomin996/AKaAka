package This_and_Super;

import java.util.Date;

import org.testng.annotations.Test;

public class TThis {
	int x=10;//non static variable
	public void m1() {
		int x=123;//Local variable
		System.out.println(x);
		System.out.println(""+this.x);

	}
	public static void main(String[] args) {
		TThis t=new TThis();
		t.m1();
	}
	
 
	

}
