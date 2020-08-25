public class instansstavar {
	
	int x=10;
	static int y = 20;
	
	public static void main(String args[]) {
		
		// Accessing instance var
		instansstavar ob = new  instansstavar();
		System.out.println(ob.x);
		
		
		// we can access static var directly
		System.out.println(y);
		
		y=30;
		System.out.println(y);
		System.out.println("Accessing instance and static var through methods");
		System.out.println(ob.m1());
		
		System.out.println(m2());
	}
	
	String m1() {
		System.out.println(y);
			instansstavar ob = new instansstavar();
			System.out.println(ob.x);
		return "accesing by instance method";
	}
	
	static String m2() {
			System.out.println(y);
			instansstavar ob = new instansstavar();
			System.out.println(ob.x);
		
		return "Accessing by static method";
	
	
	}

}
