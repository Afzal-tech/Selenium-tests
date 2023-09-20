package questions_intervewbit;

public class X_to_power_n {
	
//Write a Java Program to calculate xn (x to the power n) using Recursion. You can use O(N) time but can’t use any extra space apart from the Recursion Call Stack Space.
	
	
public static double x_to_power_n(int x, int n) {
		
		
		if( n==0) return 1;
		if (n<0) return 1/x_to_power_n(x,-n);
		return x_to_power_n(x, n-1)*x;
		
	}	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(x_to_power_n(2,6));
	


	}

}
