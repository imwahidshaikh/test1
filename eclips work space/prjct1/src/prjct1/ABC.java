package prjct1;

import java.util.Scanner;

public class ABC {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter any number");
		Scanner s= new Scanner (System.in);
		int input=s.nextInt();
		
		if ((input%4==0) || (input%4==0 && input%100!=0)) {
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not leap year");
		}

	}

}
