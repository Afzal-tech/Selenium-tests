package questions;

public class Armstrong_number {
	
	public static void armstrong(int n) {
		int result=0;
		int given=n;
			
		while(n!=0) {
			int remainder= n%10;
			result =result+ remainder*remainder*remainder;
			n=n/10;
		}
			
		
		if (result==given) {System.out.println("armstrong number");}
		else {System.out.println(" not armstrong number");}
		
		
 		
			
		
	}

	public static void main(String[] args) {
		
		armstrong(153);
		// TODO Auto-generated method stub

	}

}
