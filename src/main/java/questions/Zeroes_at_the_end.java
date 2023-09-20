package questions;

public class Zeroes_at_the_end {
	
	//pushing zeroes to the end
	public static void array() {
	
	int [] arr= {1,2,0,1,0,0,0,4,3,2,0};
	int n = arr.length;
	
	int count =0;
	
	for (int i=0; i<n; i++) {
		if(arr[i]!=0) {
		arr[count]= arr[i];
		count++;
		}
		
		
		
	}
	while(count <n) {
		arr[count]=0;
		count++;
	}
	
	for (int i =0; i<n; i++) {
		System.out.println(arr[i]);
	}
		
	}
	public static void main(String[] args) {
		array();
	}
	
}
