package questions_intervewbit;

import java.util.HashSet;

public class Unique_chars_in_String {
	//Write a program to print all the unique characters in a String. For instance, if the input string is “abcb”, 
	//the output will be the characters ‘a’ and ‘c’ as they are unique. The character ‘b’ repeats twice and so it will not be printed.
	
// brute foece aPPRAOCH
	public static String Unique_string(String name) {
		String[] str= name.split("");
	
		StringBuilder sb = new StringBuilder();
		
		  for (int i =0; i<name.length();i++) {
			  int count= 0;
			  for (int j =0; j<name.length();j++) { 
				
				 // if (name.charAt(i)==name.charAt(j)) {    // use one of these 2 if statements, with chars == sign can be used, 
				
				  if (str[i].equals(str[j])) { //  but with str .equls ,ethod is used
					  count++;	
			  	}  			
			  }
			  if (count==1) {sb.append(str[i]);}			  
		  }
		  return sb.toString();			
		}
	
	// using has set
	public static void Unique_string_hash(String name) {
		
		HashSet<Character> unique= new HashSet<Character>();
		 for (int i =0; i<name.length();i++) {
			 
			 if (unique.contains(name.charAt(i))) {
				 unique.remove(name.charAt(i));
			 }
			 else {
				 unique.add(name.charAt(i));
			 }
		 }
		 System.out.println(unique);		
	}
	
	public static void main(String[] args) {
		//Unique_string("aabcde");
		//System.out.println(Unique_string("aabcbdea"));
		Unique_string_hash("afzaaalf");
	}
}
