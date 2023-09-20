package questions;

public class LongestCommomSubstringinArrays {
	 public static String longestCommonPrefix(String[] strs) {
	        int n=strs[0].length();
	        String shortest="";

	        for (int i =0; i<strs.length; i++){
	            if (n>strs[i].length()){
	                n=strs[i].length();
	                shortest=strs[i];
	            }
	        }
	        
	        for (int i=0; i<n; i++){
	            char c= shortest.charAt(i);

	            for (String str:strs){
	                if (str.charAt(i)!=c){
	                    return shortest.substring(0,i);
	                }
	            }
	        }
	        return shortest;   
	    }
	
	public static void main(String[] args) {
		 
		String[] strs = {"flower","flow","flight"};
		//String[] strs = {"a"};
		System.out.println(longestCommonPrefix(strs));

	}

}
