package methodOverridding;

public class MethodOverloading {
	public static void add() {
		int a=10, b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add(int a, int b,double c) {
		  double sum = a+b+c;
		  System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		add();
		add(20,55);
		add(15, 20, 33.0);
	}

}
