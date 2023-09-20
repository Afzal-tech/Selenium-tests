package questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//a= {2,1,1, 2,2};  // should return true, as occurrences are unique
//a= {2,1};  // should return false, as occurrences are not  unique, both 2 and 1 havae occurred 1 times
//
public class Unique_occurance_bool {
	
	public static boolean unique() {
		int [] a= {2,1,1,2,2};  // should return true;
		Map<Integer,Integer> map = new HashMap<Integer,Integer> ();
		//Set<Integer> hash = new HashSet<Integer> ();
		
		
		
		for (int i=0; i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}
			else {
				map.put(a[i],1);
			}
			
		
			
			
	}
		Set<Integer> hash = new HashSet<Integer> (map.values());//  this  and next line is one way
		return hash.size()==map.values().size()?true:false;//
		
//		for(int count: map.values()) {
//			if(hash.contains(count))return false;
//			else {hash.add(count);}
//		}
//	
//	
//	return true;   
		
	}

	public static void main(String[] args) {
		System.out.println(unique());

	}

}
