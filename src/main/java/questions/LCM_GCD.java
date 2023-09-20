package questions;


// finding LCM amd GCD of two given numbers separately, 
// alternatively can use lcm *gcd=n1*n2
public class LCM_GCD {
	
	public static int  LCM ( int n1, int n2) {
		
		int lcm= (n1>n2)?n1:n2;  // stroing highest of two numbers as lcm is alwasys equal or greater from given two numbers
		
		while (true) {
			if (lcm%n1==0 && lcm%n2==0)break;
			
			lcm++;
		}
		return lcm;
		
	}
	
public static int  GCD( int n1, int n2) {
		
		int n= (n1>n2)?n1:n2;  // storing LOWEST of two numbers as GCD is always equal or smaller from given two numbers
		int gcd =1;
	
		for (int i=1; i<=n; i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}
	
	

	public static void main(String[] args) {
		int a=72;
		int b= 120;
		//System.out.println(LCM(a,b));
		System.out.println(GCD(a,b));

	}

}
