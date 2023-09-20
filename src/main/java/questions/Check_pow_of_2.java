package questions;

public class Check_pow_of_2 {
	
	
	public  static boolean power_of_two(int n) {
		while(n%2==0) {
			n=n/2;
		}
		if (n==1)return true;
		else {return false;}
	}

	public static void main(String[] args) {
		System.out.println(power_of_two(64));
		

	}

}
