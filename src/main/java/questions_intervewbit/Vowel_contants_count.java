package questions_intervewbit;

public class Vowel_contants_count {
	//Write a program in Java to count the total number of vowels and consonants in a String. The string can contain 
		//all the alphanumeric and other special characters as well. However, only the lowercase English alphabets are allowed in the String.
		public static void vowel_consonant(String name) {
			int vowelcount=0;
			int cons_count=0;
			int other_chars=0;
			for (int i=0; i<name.length();i++) {
				char a= name.charAt(i);
				
				if (a=='a'||a=='e'|| a=='i'|| a=='o'||a=='u') {
					vowelcount++;}
					
				else if(a>='a' && a<='z') {
					cons_count++;}
				
				else {
					other_chars++;
					
				}
				}		
			System.out.println("vowel count: "+vowelcount+"consonant count :"+cons_count+"other chars count: "+other_chars);
					
			}

		
		public static void main(String[] args) {
			vowel_consonant("appple@@#%");

		}

}
