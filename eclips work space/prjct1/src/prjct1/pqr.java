package prjct1;

import java.util.Scanner;

public class pqr {
	int r=2;

	public static void main(String[] args) {
		
		System.out.println("Please enter first no");

		Scanner s = new Scanner(System.in);
		int firstno = s.nextInt();// 10

		System.out.println("enter second no");

		int secondno = s.nextInt();// 20

		System.out.println(firstno * secondno);
}
}