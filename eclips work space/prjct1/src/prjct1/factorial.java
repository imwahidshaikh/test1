package prjct1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		System.out.println("eneter any no");
Scanner s = new Scanner(System.in);
int no = s.nextInt();
			int a=1;
			for ( int i=no ; i>=1;i--) {
				System.out.print(i + "*");
		a=i*a;
	
			}
			System.out.print("= " + a);
			

	}

}
