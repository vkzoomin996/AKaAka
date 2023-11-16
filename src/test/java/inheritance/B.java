package inheritance;

public class B extends A {
	static int x=1250;
	String s1="vk";
	public static void m3( ) {
		System.out.println("in the static method of child class");
	}
	public static void main(String[] args) {
		B p=new B();
		p.m1();
		p.m2();
		p.m3();
		System.out.println(p.a);
		System.out.println(p.s1);
		System.out.println(x);
		System.out.println(p.s);
		
	}

}
