package in.interview.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concat2ArrayList {

	public static void main(String[] args) {

		List<String> array1=Arrays.asList("Amit","Sumit","amol","aniket");
		List<String> array2=Arrays.asList("pawar","shinde","bhosle","pal");
	
		int length = array1.size();
		if (length != array2.size()) { // Too many names, or too many numbers
		    // Fail
		}
		ArrayList<String> array3 = new ArrayList<String>(length); // Make a new list
		for (int i = 0; i < length; i++) { // Loop through every name/phone number combo
		    array3.add(array1.get(i) + " " + array2.get(i)); // Concat the two, and add it
		}
		array3.forEach(value -> System.out.print(value+", "));
	}

}
