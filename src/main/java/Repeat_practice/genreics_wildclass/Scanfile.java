package Repeat_practice.genreics_wildclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanfile {
	
	


	public static void main(String[] args) throws FileNotFoundException {
		String txt= "example.txt";
		File file = new File(txt);
//		
		Scanner in = new Scanner(file);
		
		System.out.println("enter");
//		int value= in.nextInt();
//		System.out.println(value);
//		
		while(in.hasNextLine()) {
			String value= in.nextLine();
			System.out.println(value);
		}
		in.close();
		

	}

}

