package questions;

public class Factorial {
	
	//usiing recusrsion
	public static int fact(int value) {
		if(value==1)return 1;
		
		
		return fact(value-1)*(value);
	}

	//normal method
	public static int factorial(int num) {
		int ans=1;
		for (int i =1; i<=num;i++) {
			ans= ans*i;
			
			
		}
		return ans;
			
		}
		
		
	
	public static void main(String[] args) {
		//System.out.println(fact(3));
		System.out.println(factorial(4));
		
		
		
		
	
	}

}
