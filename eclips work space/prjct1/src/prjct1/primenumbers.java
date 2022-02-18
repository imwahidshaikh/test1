package prjct1;

public class primenumbers {

	public static void main(String[] args) {
		
		int c=0;
		int d=0;
		for (int b =1; b<=100;b++ ) {
		for ( int a = 2; a <=b-1; a++) {
		
		if (b%a==0) {
			c++;	
		}
		}
		if (c==0){
		System.out.print(b+" ");
		d++;
		
		}
		else {
			c=0;
		}
		
		
		}
		{System.out.println("& Total prime numbers are = " +d);}
		
}
}