package in.edac;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(12);
		list.add(11);
		
		List<Integer> arr= Arrays.asList(1,2,3,4,5);
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		
		System.out.print(list);
		Collections.reverse(list);
		System.out.println(list);
		
		/*
		 * int mid=5+0; int x=mid/2; System.out.println(x);
		 */
		
	}

}
