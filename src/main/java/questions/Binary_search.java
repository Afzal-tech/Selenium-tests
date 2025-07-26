package questions;

import java.util.Arrays;

public class Binary_search {
	/// for binary search array should be sorted
	
	// normal Implementation
	public static int  binary_search() {
		int [] arr ={1,7,9,4,6,11,15,2,7,0};
		Arrays.sort(arr);
		
		int n = arr.length;
		
		int x=2; // elemnt to be searched
		
		int low= 0;
		int high= n-1;
		 while(high>low) {
			 
			int med= (low+high)/2;
			
			if (arr[med]==x) return med;

			
			else if(arr[med]<x) {
				low= med+1;
			}
			
			else if (arr[med]>x) {
				high = med-1;
			}
			
		 }
		
		return -1;
	}

	
	
	
	// binary search using recursion
	//int [] arr ={1,7,9,4,6,11,15,2,7,0};
public static int  binary_search(int [] arr ,int low, int high,  int number) {	

		if (low>high) {
			return -1;
		}

		int med= (low+high)/2;

		if (arr[med]==number) {return med;}


		else if(arr[med]<number) {
			return binary_search(arr, med+1, high, number);
		}

		else if (arr[med]>number) {
			return binary_search(arr, low, med-1, number);
		}
		return med;


	}

	public static void main(String[] args) {
		// normal implmentation
		if (binary_search()==-1)System.out.println("number not found");
		else{
			System.out.println("number found at index: "+binary_search());
		}	
	
		// recursion code calling
		int number =1; // number to be searched in binary search
		int [] arr ={1,7,9,4,6,11,15,2,7,0};
		Arrays.sort(arr);
		for (int b:arr){
			System.out.print(" "+b); 	
		}
		
		int low=0;
		int high =arr.length-1;
		int  index= binary_search(arr, low, high, high);

		if ( index==-1)System.out.println("number not found");
		else{
			System.out.println("number found at index: "+index);
		}	
		
	}
}



