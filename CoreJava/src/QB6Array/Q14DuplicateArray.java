package QB6Array;

import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q14DuplicateArray {
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,3,5,2,7};
		Set<Integer>uniqueset=new LinkedHashSet<>();
		for(int num:arr) {
			uniqueset.add(num);
			
		}
		int[]uniqueArray=new int[uniqueset.size()];
		int i=0;
		for(int num:uniqueset)
			
		{
			uniqueArray[i++]=num;
		}
		System.out.println("Array without duplicate:"+ Array.( uniqueArray));
	}

}
