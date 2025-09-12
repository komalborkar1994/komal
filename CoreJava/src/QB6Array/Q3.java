package QB6Array;

public class Q3 {
	public static void main(String[] args) {
		
		int arr[]= {23,13,45,67,75	};
		
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
			if(arr[i]>max)
		{      max=arr[i];
			
		}
		System.out.println("greater no:"+max);
		}

}
