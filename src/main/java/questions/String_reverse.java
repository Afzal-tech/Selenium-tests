package questions;

public class String_reverse {
	
	public static void reverse_entire() {
		String a= "My name is Afzal";
		int n = a.length();
		
		for (int i=0; i<n;i++) {
			System.out.print(a.charAt(n-1-i));
			//output: lazfA si eman yM
		}

		System.out.println(" "); // space for next method not a logic
		
	}
	public static void reverse_string_not_word() {
		String a= "My name is Afzal";
		// output:: Afzal is name My 
		int n = a.length();
		String [] arr = a.split(" ");
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}	
		
		System.out.println(" "); // space for next method not a logic
		}
	
	
		public static String reverse_word(String name) {
			String [] str= name.split(" ");

			StringBuilder sb= new StringBuilder();
		
			 for(int i=0; i<str.length;i++) {
				String  word= str[i];
				 for (int j=0; j<word.length(); j++) {
						sb.append(word.charAt(word.length()-1-j));
						
					}
				 sb.append(" ");
				 
			 }

			return sb.toString();
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		//reverse_entire();
		//reverse_string_not_word();
		System.out.println(reverse_word("My name is Afzal"));   // output :: yM eman si lazfA 

	}

}
