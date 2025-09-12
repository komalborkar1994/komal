package QB6Array;

public class Q8positiveNegetive {
	public static void main(String[] args) {
		int arr[]= {12,-65,14,-34};
		int positiveno=0;
		int negetiveno=0;
		for(int i=0;i<arr.length;i++)
			if(i>0)
		{
				positiveno++;
			
		}else if(i<0)
		{
			negetiveno++;
		}
		System.out.println("positive no:"+positiveno);
		System.out.println("negetive no:"+negetiveno);
	}

}
