package questions_intervewbit;

public class Reverse_a_number {
	public static void reverse_a_number (int N) {

		long rev=0;
		long r=0;

		while(N!=0) {

			r= N%10;
			N= N/10;;
			rev= rev*10 +r;
		}
		
		System.out.println(rev);

	}
	public static void main(String[] args) {
		//reverse_a_number (123489);
		reverse_a_number (1534236469);
		


	}

}
