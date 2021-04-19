package in.edac;

public class SecondHighest {

	private static int getSecondLargest(int[] arr, int total) {
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("[ ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("] ");
		return arr[total-2];
		
	}
	
	public static void main(String[] args) {
		int arr[]= {17,12,18,19,11,15,9};

		int lar=getSecondLargest(arr,arr.length);
		System.out.println(lar);
	}

	

}


//How to Sort HashMap by values?
