package questions;

public class Int_pallindrome {
	public static boolean integer_pallindrome(long N) {
		long rev=0;
		long A=N;
		int count=0;
		while(N!=0) {
			rev= rev*10+N%10;
			count++;
			N=N/10;
			
		}
		System.out.println("total digits are: "+count);
		if (rev==A)return true;
		else { return false;}
		
	}

	public static void main(String[] args) {
		System.out.println(integer_pallindrome(234321));
		
		// TODO Auto-generated method stub

	}


}
