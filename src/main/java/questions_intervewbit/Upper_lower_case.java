package questions_intervewbit;

public class Upper_lower_case {
	
	//Write a program in Java to Toggle the case of every character of a string. For instance, if the input string is “ApPLe”,
	//the output should be “aPplE”.

		//Method1
		public static void upper_lowe_case(String name) {
	
			char [] char1= name.toCharArray();
			String [] arr = name.split("");
			
			for (int i=0; i<name.length();i++) {
				if (Character.isUpperCase(char1[i]) ){
				arr[i]= arr[i].toLowerCase();
					
				}
				else {
					arr[i]= arr[i].toUpperCase();
				}	
			}
			for (String s: arr) {
				System.out.print(s);
			}	
			
			System.out.println(); // only for console,, no impact on code
		}
		
		//Method 2
	public static String upper_lower_case(String name) {
			
		StringBuilder sb = new StringBuilder();
			for (int i=0; i<name.length();i++) {
			
			if(Character.isUpperCase(name.charAt(i))){
				sb.append(Character.toLowerCase(name.charAt(i)));		
			}
			else {
				sb.append(Character.toUpperCase(name.charAt(i)));
			}
				
			}
			
			return sb.toString();	
			
		}
			
		
		public static void main(String[] args) {
			upper_lowe_case("ApPLe");
			System.out.println(upper_lower_case("afzAL"));
		}

}
