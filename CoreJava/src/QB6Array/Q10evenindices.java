package QB6Array;

public class Q10evenindices {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40,40,50};
		
		System.out.println("element at even indices");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("index"+i+" "+arr[i]);
			}
		}
		
	}

	
}
