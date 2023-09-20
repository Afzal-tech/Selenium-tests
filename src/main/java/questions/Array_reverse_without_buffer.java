package questions;

public class Array_reverse_without_buffer {
	
	// array reverse without bufffer memory of array
	// main logic is iterating the array to its hafk lenght for swapping the values
		public static void array_reverse() {
			
			int[] arr = {1,3,2,9,7,8,5};
			int temp;
			int n = arr.length;
			for(int i =0; i<n/2;i++) {
				temp= arr[n-1-i];
				arr[n-1-i]= arr[i];
				arr[i]= temp;
			}
			
			for(int i :arr) {
				System.out.print(i+" ");
			}

		}

		public static void main(String[] args) {
			array_reverse();

			// TODO Auto-generated method stub

		}

}
