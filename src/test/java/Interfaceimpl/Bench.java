package Interfaceimpl;

 
 
    class Bench implements Car {
	

	@Override
	public void starring() {
 System.out.println("left");		
	}

	@Override
	public void engine() {

System.out.println("diesel engine");		
	}
	public static void main(String[] args) throws Throwable {
		Bench bb=new Bench();
		bb.starring();
		bb.engine();
 	}
}
