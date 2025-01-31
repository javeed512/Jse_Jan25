package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {


	Set<Integer> 	  set =	new HashSet<Integer>();
	
				set.add(10);
				set.add(20);
				set.add(30);
				set.add(90);
				set.add(104);
				set.add(null);
				set.add(30);
				
				
				System.out.println(set);
		

	}

}
