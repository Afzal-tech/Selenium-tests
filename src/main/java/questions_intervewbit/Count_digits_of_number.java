package questions_intervewbit;

public class Count_digits_of_number {
	
	
	public static void counter (int N) {
		int count=0;
		
		if (N<0)System.out.println("Invalid number");
			
		
		else {
		while(N!=0) {
			 N=N/10;
			 count++;
			
		}
		System.out.println(count);
		}
		
		
	}

	public static void main(String[] args) {
		counter(9);

	}

}
