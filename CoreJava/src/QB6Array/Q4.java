package QB6Array;

public class Q4 {
	public static void main(String[] args) {
		int arr[]= {43,78,10,34,23,};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
			if(arr[i]<min) {
		
			min=arr[i];
		}
		
		System.out.println("minimum No value: "+min);
	}

}
