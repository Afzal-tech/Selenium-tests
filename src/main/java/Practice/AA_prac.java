package Practice;

import java.util.*;
//You are given an array of integers arr[] of size n and an integer k.
//Your task is to find the maximum sum of any contiguous subarray of size k.
class AA_prac {
	//1
	public static  int max_subarray() {
		int[] arr = {23, 2, 4, 11, 19, 3, 8};
		int k=3;
		int sum =0;
		int max =0;
		for (int i=0; i<k; i++){
			sum+=arr[i];
			max= sum;
		}


		for(int i=k; i <arr.length; i++){
			sum= sum+ arr[k]-arr[i-k];
			max =Math.max(sum, max);


	}
		 return max;


	}

	public static void main(String[] args) {

		 int  number=max_subarray();
		 System.out.println(number);



	
}
	}


