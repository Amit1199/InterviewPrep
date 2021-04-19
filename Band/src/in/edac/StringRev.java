package in.edac;

public class StringRev {

	/*
	 * public static void main(String[] args) {
	 * 
	 * StringBuilder str=new StringBuilder(); str.append("hello"); str.reverse();
	 * System.out.println(str);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		String str="hello";
		String s="";
		char[] ch=str.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			s+=ch[i];
		}
		System.out.println(s);
	}

}
