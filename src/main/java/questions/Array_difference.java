package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_difference {
	
	
	public static  int array() {
		
		
		
	String[] string= {"1","15","4","3","2","1"};
	
	int[] arr = new int[string.length];
	
	for (int i=0; i<string.length; i++){
	arr[i]= Integer.parseInt(string[i]);
		//System.out.println("new");
		
	}
	
//		int[] arr2 = {1,15,2,3,2,1};
//	System.out.println(Arrays.toString(arr2));
	
		
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		
		int n= arr.length-1;
		//System.out.println(n);
		int k=0;
		for (int j=1; j<=n; j++) {
			
			for (int i=0; i<j; i++) {
				if(arr[i]<arr[j]) {
					//System.out.println((arr[j]-arr[i]));
					arr1.add(arr[j]-arr[i]);				
				   }				
			}					
		}
		if(arr1.size()==0) {
			//
			System.out.println("-1");
			return -1;
		}
		else {
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(arr1.size()-1));
		}
		return 1;	
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(array());
		
		
		
		
		
		
		

	}

}
