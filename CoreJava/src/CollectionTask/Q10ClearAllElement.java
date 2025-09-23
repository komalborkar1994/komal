package CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Q10ClearAllElement {
	public static void main(String[] args) {

		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("e");
		System.out.println("before:"+list);
		
		list.clear();
		System.out.println("after"+list);
	}

}
