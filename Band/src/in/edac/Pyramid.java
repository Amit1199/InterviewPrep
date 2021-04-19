package in.edac;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("Enter Number of columns");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			for (int j = i; j < r; j++) {
				System.out.print("   ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print(" * ");
			}
			for (int l = 1; l < i; l++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
