package questions;

import org.apache.poi.util.SystemOutLogger;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a continuous 
	//  * sub array [numsl, numsl+1, ..., numr-1, numsr] of which the sum is greater than or equal to target.
//If there is no such sub array, return 0 instead.

public class Length_min_subarray {
	
	// here we have used sliding window approach using left and right pointers
	
	 public static int maxsubbraylength() {
//		 int[] nums = {2, 3, 1, 2, 4, 1};
//	        int target = 7;
	        
	        int[] nums= {1,1,8,2,2,4,8,7,6,4,2};
	    	int target =12;
	        
	         int minlength= Integer.MAX_VALUE;
	        int left=0;
	       
	        int sum=0;
	        int strt=0;
	        int end =0;
	        
	        
	        
	        for (int right=0; right<nums.length; right++) {
	        	sum+=nums[right];
	        	
	        	while(sum>=target) {
	        		if(minlength>right-left+1) {
	        			minlength=right-left+1;
	        			
	        			strt= left;
		        		end= right;
	        			
	        		}
	        	
	        		sum-=nums[left];
	        		
	        		left++;
	        	}
	        }
	        int[]subarray = new int[minlength];
	        // copying desired subarray elements from gievn array to new array;
	        System.arraycopy(nums, strt, subarray, 0, minlength);
	        for (int a:subarray) {
	        System.out.print(a+" ");
	        }
	        System.out.println(); // just a new line 
	       return minlength==Integer.MAX_VALUE?0:minlength;
	        
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxsubbraylength()); 

	}

}
