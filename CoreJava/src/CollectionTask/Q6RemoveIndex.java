package CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Q6RemoveIndex {
	public static void main(String[] args) {
		

		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		System.out.println("before:"+list);
		
		list.removeFirst();
		System.out.println("after"+list);
		
	}

}
