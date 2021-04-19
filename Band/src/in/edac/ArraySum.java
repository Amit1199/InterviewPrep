package in.edac;

public class ArraySum {

	public static void main(String[] args) {
		int count=0;
		int[] arr=new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(i+1)*2;
		}
		for (int i : arr) {
			count+=i;
			System.out.print(i+" ");
		}
		System.out.println("sum= "+count);
	}

}
