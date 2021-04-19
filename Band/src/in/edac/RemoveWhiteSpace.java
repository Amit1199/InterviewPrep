package in.edac;

public class RemoveWhiteSpace {

	private static StringBuffer withOut(String string) {

		StringBuffer sb=new StringBuffer();
		int i = 0;
		while(i<string.length())
		{
			if(string.charAt(i)!=' ') {
				sb.append(string.charAt(i));
			}
		
			i++;
		}
		return sb;
		
	}
	
	public static void main(String[] args) {

		System.out.println(withOut("India is  My COuntry"));
	}

}
