package QB6Array;

public class Q21CountGreaterThan {
	public static void main(String[] args) {
		int[]arr= {5,34,78,12,30};
		int givenNumber=10;
		int count=0;
		for(int num:arr)
			if(num>givenNumber)
			{
				count++;
			}
		}

System.out.println("number of element greater than"+ givenNumber+ ": "+count);


}



