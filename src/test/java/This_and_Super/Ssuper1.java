package This_and_Super;

public class Ssuper1  extends Ssuper{
	String v="pawan";
	
	public void m1() {
		String v="jai";
		System.out.println(v);
		System.out.println(this.v);
		System.out.println(super.v);
 	}
	public static void main(String[] args) {
		Ssuper1 s=new Ssuper1();
		s.m1();
	}

}
