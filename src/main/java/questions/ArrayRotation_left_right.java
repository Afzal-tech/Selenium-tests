package questions;

public class ArrayRotation_left_right {

	public  static void left_rotation() {
		int[] nums= {1,2,3,4,5,6,7};
		int n =nums.length;
		int k=2;
		k=k%nums.length;
		int[] temp= new int[n];
		
		
		for (int i=0; i<n;i++) {
			temp[i]= nums[(i+k)%n];//  using this it will be left rotation;
			//temp[(i+k)%n]= nums[i]; //  using this it will be right rotation ;
		}
		for (int i=0; i<n;i++) {
			nums[i]= temp[i];
			System.out.print(nums[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		left_rotation();
	
	
}

}
