package questions_intervewbit;

public class Duplicate_didgits_in_number {
	
	//Write a program in Java to calculate the number of times a digit ‘D’ appears in a number N. You have to take N and D as inputs from the user.

	public static void duplicate_digits(int D, int N) {
		
		int r=0, count=0;
		
		
		while(N!=0) {
			r= N%10;
			N=N/10;
			if(r==D) {count++;}
			
		}
		System.out.println(count);
	
		
	}	
	
	
	
	
	public static void main(String[] args) {
		duplicate_digits(4, 412544454);


	}

}
