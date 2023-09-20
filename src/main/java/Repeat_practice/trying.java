package Repeat_practice;

import java.util.Scanner;

public class trying {

	public static void main(String[] args) {
		//arrays();
		//strings_array();
		multi_dimension_array();

		
		

	}
	
	
	public static  void arrays() {
		int[] values= new int[3];
		
		System.out.println(values[1]);
		// by defaukt 0 is stored in array
		values[0]= 1;
		values[1]= 10;
		values[2]= 20;
		
		for (int i=0; i<values.length;i++)
			System.out.println(values[i]);
		
		
	}

	public static void strings_array() {
		
		String [] texts= {"hi", "hello", "how are you"};
		System.out.println(texts[0]);
		
		String[] words = new String[2];
		words[0]= "practice";
		System.out.println(words[0]);
		
	}
	
	public static void multi_dimension_array() {

		int [][] value = {
				{1,2, 234},
				{4, 90},
				{40, 66, 93}};
		
		//printing entire 2 d array using for
		for (int row=0; row<value.length; row++) {
			for (int col= 0; col<value[row].length; col++) {
				System.out.print(value[row][col]  +"\t");
			}
			System.out.println();
		}
		
		System.out.println(value[0][2]); 
		
		// also we can  partialy define 2 d Array
		String [][] text= new String[3][];
		text[0]= new String[2];
		text[1]= new String [3];
		
		text[0][1]= "hello" ;
		System.out.println(text[0][1]);
		
		}
}
