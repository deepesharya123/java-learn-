import java.util.Scanner;

public class staticandinstance {

	int x=10;		// this is instance var
	static int y =20;

	
	
	
	public static void main(String args[]) {
		
		staticandinstance ob = new staticandinstance();
		
		System.out.println(ob.x); 			//x==10;
		
		staticandinstance b = new staticandinstance();
		b.x=2000213451;
		System.out.println(b.x);
		
		System.out.println(b.m1()+" this is b.m1");//2000213451
		System.out.println(ob.m1()+ " this is ob.m1");	//10
//		System.out.println(m1());
		
		
		System.out.println("             STATIC       ");
		System.out.println(y);
		System.out.println(b.y);
		System.out.println(staticandinstance.y);
		b.y=123;
		System.out.println(y);
		System.out.println(staticandinstance.y);
		System.out.println();
		
		System.out.println(" \"static mewthod call throgh \" ");
		
		System.out.println(m2());
		
		
	}int    m1() {
		
		System.out.println("ASDF");
		
		System.out.println(x+" is the value of x");
		return 100;
		
//		System.out.println(y);
	}
	
	
	static int m2() {
		System.out.println(" in the staitc member function ");
		System.out.println(y+" y value under m2 method");
		
		
		return 100;
		
	}
	
	
}


