package prjct1;

import java.util.Scanner;

public class xyz {
	

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the number");
		 int no= s.nextInt();
		 int count = 0;
		
		for ( int a = 1; a <=no; a++) {
		
		if (no%a==0) {
			count++;
			
		}
		}
		
		if (count==2){
		System.out.println(no + " is prime number");}
		else {
			System.out.println(no + " is not prime number");
		}

		}
		
		}
		
		

	


