package in.edac;

public class Palindrome {

	private static boolean flag;

	private static boolean isPalindrome(String string) {
		int h=string.length()-1;
		int l=0;
		
		while(l<h)
		{
			if(string.charAt(l)==string.charAt(h))
			{
				flag=true;
			}else
			{
				flag=false;
				break;
			}
			l++;
			h--;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("radbr"));

	}

	
}
