package in.edac;

import java.util.Arrays;

public class EqualArrays {

	   public static void main(String[] args) {

		      // initiliazing three object arrays
		      int[] arr1 = { 1, 123 };
		      int[] arr2 = { 1, 123, 22, 4 };
		      int[] arr3 = { 1, 123 };

		      // comparing arr1 and arr2
		      boolean retval = Arrays.equals(arr1, arr2);
		      System.out.println("arr1 and arr2 equal: " + retval);

		      // comparing arr1 and arr3
		      boolean retval2 = Arrays.equals(arr1, arr3);
		      System.out.println("arr1 and arr3 equal: " + retval2);
		   }
}


