package prjct1;

public class fibbonacci {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	int count=7;
	 System.out.print(a+" "+b);
	for (int i=2;i<count;i++) {c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;}
	}

}
 // 0+1=1; 1+1=2; 2+1=3; 3+2=5