package in.edac;

public class OnlyOdd {

	public static void main(String[] args) {

		boolean flag=true;
		int[] arr= {1,3,5,7,8};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
				flag = false;
			}
		}
		String s=flag==true ? "odd":"Not odd";
		System.out.println(s);
	}

}
