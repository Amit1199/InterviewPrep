package in.edac;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		System.out.println("enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		if (n == 1 || n == 2)
			flag = true;
		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					flag = false;

			}
		}
		if (flag == true)
			System.out.println("Prime");
		else
			System.out.println("non prime");

	}

}
