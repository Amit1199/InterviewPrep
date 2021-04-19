package in.interview.p;

import java.util.Arrays;

public class AnagramString {
	static void isAnagram(String str1, String str2) {
		boolean status = true;

		char[] ArrayS1 = str1.toLowerCase().toCharArray();
		char[] ArrayS2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);
		status = Arrays.equals(ArrayS1, ArrayS2);

		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
	}
}
