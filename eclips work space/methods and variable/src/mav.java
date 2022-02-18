
public class mav {

	public static void main(String[] args) {
		
		System.out.println(ask.z);
		System.out.println("in main method");
		
		demo();
	}
	static void demo() {
		System.out.println("in demo method");
		mav f = new mav();
		f.m1();
		m2();
		
	}
	
	void m1() {
		System.out.println("in m1 method");
		System.out.println(ask.z++ +20);
		
		
	}
	static void m2() {
		System.out.println("in m2 method");
		System.out.println(ask.z+20);
	}

}
