package questions;

import java.util.HashMap;
import java.util.Map;


//program to print the count of duplicate characters in a String using hashmap
// same can be used fir integer aaray if  integer hasmap is used
public class String_duplicates_count {

	public static void print_duplicates_hash(String str) {
		
		str= str.replaceAll("\\s", "");  // is only used when we have to remove all white spaces

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character  c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {map.put(c, 1);}

		}	
		for(Map.Entry<Character,Integer> entry :map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}


	}

	public static void main(String[] args) {
		print_duplicates_hash("aafzaallaaanvggth");

		// TODO Auto-generated method stub

	}

}
