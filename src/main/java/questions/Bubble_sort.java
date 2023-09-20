package questions;

public class Bubble_sort {
public static void bubble_sort( ) {
		
		int[] arr = {1,35,21,2,9,5,6,2,4,5,12};
		int n = arr.length;
		int temp;
		
		
		for (int i=0; i<n; i++) {
			
			for(int j=0; j<n-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {   // only j is used in looping for bubble sort
					
					temp= arr[j+1];
					arr[j+1]= arr[j];
					arr[j]= temp;
					
				}
				
			}
		}
		for(int a: arr) {
			System.out.println(a);
		}
		
		
	
	}

	public static void main(String[] args) {
		bubble_sort();		
		

	}

}
