package QB6Array;

public class Q6averageArrayElement {
	public static void main(String[] args) {
		
		int arr[]= {2,4,3,1,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		double average=(double)sum/arr.length;
		System.out.println("Average of array element: "+average);
		
	}

}
