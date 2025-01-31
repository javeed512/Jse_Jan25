package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		//List<Object> list = new ArrayList<Object>();
		
		List<Object> list = new LinkedList<Object>();

		list.add(10);  // new Integer(10);
		list.add(4.55);  // new Double(4.55)
		
		list.add(false);  // new Boolean(false);
		list.add(new String("hello"));
		list.add(10);
		list.add(null);

		
		System.out.println(list);
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		 list2.add(101);
		 list2.add(103);
		 list2.add(104);
		 list2.add(105);
		 
		 System.out.println("For Each Loop");
		
		for(Integer i: list2) {
			
			System.out.println(i);
			
		}
		
		
		System.out.println("Iterator PRINTS ");
		
		
				Iterator<Integer> it =		list2.iterator();
			
					while(it.hasNext()) {
						
					Integer  i = 	 it.next();
					
					System.out.println(i);
						
					}
		
		
		
	}

}
