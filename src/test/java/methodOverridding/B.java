package methodOverridding;

public class B extends A {
 		  
		  public   void greeting() {
				System.out.println("namste");
			}	
		  public static void main(String[] args) {
			B b= new B();
			b.greeting();
		}
	}



