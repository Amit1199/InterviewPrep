package in.edac;

import java.util.Scanner;

public class Fibonacci {

	static int n1=0;
	static int n2=1;
	static int n3;
	static int number; 
	
	static void fib(int n)
	 {    
		  n3=n1+n2;    
		  System.out.print(n3+" ");    
		  n1=n2;    
		  n2=n3; 
		  if(n>3)
		  fib(n-1);
	}

	public static void main(String[] args) {
		System.out.print("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");  
		fib(number);
		sc.close();
		
	}

}
