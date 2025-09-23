package CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Q5ChangeIndexPosition {
	public static void main(String[] args) {
		

		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		System.out.println("before:"+list);
		
		list.remove(1);
		System.out.println("after"+list);
		
	}

}
