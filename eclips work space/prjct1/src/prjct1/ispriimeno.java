
package prjct1;

import java.util.Scanner;

public class ispriimeno {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		
		int c=0;
		for (int i=2;i<a;i++) {
			if (a%i==0) {
				c++;
			}
			
			

	}
		if (c==0) {
			System.out.println(a +" is  pirme number");
		}
		else {
			System.out.println(a +" is not pirme number");
			c=0;
		}
	

}}
