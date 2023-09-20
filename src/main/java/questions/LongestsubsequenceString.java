package questions;

import java.util.HashMap;
import java.util.Map;

public class LongestsubsequenceString {
	
	// for a given String  find the longest subsequence of non repeating characters
		// the approach used is called sliding window approach
		public static void longestsbusequence() {
			
			String str= "abcacbd";
			Map<Character, Integer> map= new HashMap<Character,Integer>();
			
			int left =0;
			int strtindx=0;
			int endindx= 0;
			int maxlength= 0;
			for (int right=0; right<str.length(); right++) {
				
				char c = str.charAt(right);
				
				if (map.containsKey(c)) {
					 left = Math.max(left, map.get(c)+1);
				}
				
				map.put(c, right);
				if ((right-left+1)>maxlength) {
					maxlength= right-left+1;
					strtindx=left;
					endindx=right;
				}
				
				
			}
			System.out.println(maxlength+" "+str.substring(strtindx, endindx+1));
		}

	public static void main(String[] args) {
		longestsbusequence();

	}

}
