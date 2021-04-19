package in.edac;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = { 90, 23, 5, 109, 12, 22, 67, 34 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
