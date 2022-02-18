package prjct1;

public class block {
static String a="mobiles";
int r;
String f;

	public static void main(String[] args) {
	
	block m =new block();
	m.r=6;
	m.f="xs";
	block m1 =new block();
	m1.r=9;
	m1.f="xr";
	System.out.println(a);
	System.out.println(m.r);
	System.out.println(m.f);
	System.out.println(m1.r);
	System.out.println(m1.f);
		
	}
	 
	static { System.out.println( "a");}
	{System.out.println( "b");}
}

 