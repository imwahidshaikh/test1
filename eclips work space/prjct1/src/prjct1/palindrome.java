package prjct1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int no = s.nextInt();
		int m=no;
		int a, b=0;
		while(no!=0) {
			a = no%10;
			b=b*10+a;
			no=no/10;
			
		}
		
		
		if (b==m) {	System.out.println(m + " is palindromenumber");
		}
		else {
			System.out.println(m + " is not a palindromenumber");
		}
		
		
		
		
		
	}

}
