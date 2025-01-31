package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


				Set<String>  set  = new TreeSet<String>(); // Only HOmogenous elements are allowed
				
				set.add("ford");
				set.add("smith");
				set.add("adam");
				set.add("king");
				set.add("adam");
				
				System.out.println(set);
		
		
	}

}
