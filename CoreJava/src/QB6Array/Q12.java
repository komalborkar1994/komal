package QB6Array;

public class Q12 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int arr[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		System.out.println("Element of new Array :");
		for(int sum:arr)
		{
			System.out.println(sum+" ");
		}
		
	}

}
