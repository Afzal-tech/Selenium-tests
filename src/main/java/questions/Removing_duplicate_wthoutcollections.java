package questions;

import java.util.ArrayList;


//Write a program to remove duplicates from an array in Java without using the Java Collection API. The array can be anarray of String, 
//Integer or Character, your solution should be independent of the type of array. If you want to practice more array-based questions, then see 
//this list of top 30 array interview questions from Java interviews.

public class Removing_duplicate_wthoutcollections {
	
	
	public static  void removing_string_duplicate(String S){
		char[] ch= S.toCharArray();
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<S.length();i++) {
			int j;
		
			for ( j=0;j<i;j++) {
				
				if(ch[i]==ch[j])break;
			 
			}
		
			if(i==j) {
				sb.append(ch[i]);
			}			
		}
		System.out.println(sb.toString());
		
	}

	public static  void removing_int_duplicate(int [] arr) {
		int n= arr.length;
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int j;
			for ( j=0;j<i;j++) {
				
				
				 if(arr[i]==arr[j])break;
//				
				 
				}
				
				if(i==j) {
					//System.out.println(i+" "+j);
					res.add(arr[i]);}
		
		}
		System.out.println(res);
	}
		
		public static void main(String[] args) {
			int[] arr= {1,2,1,1,4,5,6,2};
			removing_int_duplicate(arr);
			
			//removing_string_duplicate("xafzal");
			
			
			

		}

	
	

}
