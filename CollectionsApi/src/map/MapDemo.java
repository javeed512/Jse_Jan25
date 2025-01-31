package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// k,v
		
		// Map<Integer, String> map = new HashMap<Integer, String>();

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(104, "Ford");
		map.put(102, "Smith");
		map.put(103, "King");
		map.put(101, "Tom");
		map.put(102, "Javeed");
		map.put(105, "King");

		System.out.println(map);

		Set<Integer> set = map.keySet();

		for (Integer k : set) {

			System.out.println(k + " " + map.get(k));

		}

	}

}
