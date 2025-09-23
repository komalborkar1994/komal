package CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Q9ItreateArrayList {
	public static void main(String[] args) {
		

		List<String>list=new ArrayList<String>();
		list.add("komal");
		list.add("Geeta");
		list.add("Ram");
		list.add("Gattya");
		System.out.println("before:"+list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}
}
