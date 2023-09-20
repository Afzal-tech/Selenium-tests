package collections.practice;

import java.util.HashMap;
import java.util.Map;

public class Haspmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		
		//System.out.println(map.get;
		
		for (Map.Entry<Integer, String> entry:map.entrySet()) {
			int key=entry.getKey();
		String value=entry.getValue();
		
		System.out.println(key+" "+value);
		}
	}

}
