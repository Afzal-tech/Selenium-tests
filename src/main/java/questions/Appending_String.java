package questions;

import org.apache.commons.lang3.StringUtils;

public class Appending_String {

/// in word tomorrow, add $ as many times as the number of occurance of o
// tomorrow ==== t$m$$r$$$w

	//method 1 using String utils
	public static void append_string() {
		String b ="tomorrow";
		int n =b.length();
		String a="";
		int count =0;
		for (int i=0; i<n;i++) {
	
			if (b.charAt(i)=='o' ){
				count++;
				String repeat=StringUtils.repeat("$", count);
				a=a+repeat;
			}
			else {
				a= a+b.charAt(i);
			}
		}
		System.out.println(a);
	}


	//method 2
	public static void append_string2() {
		String b ="tomorrow";
		int n =b.length();
	
		int count =0;

		StringBuilder sb= new StringBuilder();

		for (int i=0; i<n;i++) {
			if (b.charAt(i)=='o') {count++;
			for (int j =0;j<count;j++) {
				sb.append("$");
			}}
			else {
				sb.append(b.charAt(i));
			
			}

			}
		System.out.println(sb.toString());
		}
	public static void main(String[] args) {
		append_string();
		
		append_string2();  // 2nd method

	}

}
