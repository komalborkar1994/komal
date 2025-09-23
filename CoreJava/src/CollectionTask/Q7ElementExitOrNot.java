package CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Q7ElementExitOrNot {
	
	public static void main(String[] args) {
		

		List<String>list=new ArrayList<String>();
		list.add("komal");
		list.add("Ram");
		list.add("seeta");
		list.add("geeta");
		System.out.println("before:"+list);
		
		String search="seeta";
		if(list.contains(search))
		{
			System.out.println("Exit in Arraylist");
		}
		else {
			
		
		
		System.out.println("not Exit in array list");
		
	}}
}


