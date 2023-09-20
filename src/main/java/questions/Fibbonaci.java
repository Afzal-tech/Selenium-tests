package questions;

public class Fibbonaci {
	
	public static void fibbonaci(int n) {
		
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		System.out.println(n1);
		
		for (int i=1; i<n-1;i++) {
			 n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
			
		}
		System.out.println("final "+n3);
		
		
	}
	
	//fibonaaci using recursion
	
public static int fibonacci_recursion(int n) {
	
	if(n==0 )return 0;
	if(n==1)return 1;	
	 return fibonacci_recursion(n-1)+fibonacci_recursion(n-2);
	
	
	
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
	//fibbonaci(5);
		System.out.println(fibonacci_recursion(6)); 

	}

}
