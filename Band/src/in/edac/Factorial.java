package in.edac;

import java.util.Scanner;

public class Factorial {


	private static int fact(int n) {

		if(n>1)
		return n*fact(n-1);
		else
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Factorial of "+n+" = "+fact(n));
		sc.close();
	}


}
