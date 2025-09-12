package QB6Array;

public class Q22SumOfEvenNo {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7};
		int sum=0;
		for(int num:arr) {
			if(num%2==0) {
				sum+=num;
			}}
		System.out.println("sum of even element:"+sum);
		
	}

}
