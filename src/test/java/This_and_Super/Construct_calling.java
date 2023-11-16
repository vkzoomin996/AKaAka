package This_and_Super;
//Construct_overloading
public class Construct_calling   {
 	public  Construct_calling( ) {
 		this(10);
		String v="jaivhgfg";
		System.out.println(v);
	 
 	}
	public  Construct_calling(String  p1) {
		this();

  		String v="vkzoom";

		System.out.println(v);
	
	}
	public  Construct_calling(int  p) {
		

  		int v=23;

		System.out.println(v);
	
	}
	 
	public static void main(String[] args) {
		Construct_calling s1=new Construct_calling("hjj");
		

  
		
  	}


}
