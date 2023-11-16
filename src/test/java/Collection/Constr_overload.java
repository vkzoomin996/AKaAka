package Collection;

public class Constr_overload {
	int x;
	String p;
	double y;
	public Constr_overload(int a) {
 
		x=a;
		System.out.println(x);

	}
	public Constr_overload(double b) {
		y=b;
		System.out.println(y);

	}
	public Constr_overload(String s) {
		p=s;

 		System.out.println(p);
 	}
	public static void main(String[] args) {
		Constr_overload c=new Constr_overload(10);
		Constr_overload c1=new Constr_overload("veeru");

		 

	}
	

}
