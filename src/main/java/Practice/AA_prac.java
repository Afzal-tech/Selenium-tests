package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class AA_prac {
	//1
	public static void duplicates() {
		
		int [] arr = {1,2,4,11,19, 3,8};
		int temp=0;
		
		for(int i =0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for (int s: arr) {System.out.println(s);}
				
		
		
	
		
		
	
	}

		
			
				
		public static void two_sum() {
			int [] arr = {1,2,4,11,19, 3,8};
			int target =7;
			int[] temp = new int[2];
			
			Map<Integer,Integer> map = new HashMap<>();
			
			for (int i=0; i<arr.length; i++) {
				if (map.containsKey(target-arr[i])) {
					temp[1]=i;
					temp[0]= map.get(target-arr[i]);
					System.out.println(temp[0]+" "+ temp[1]);
					
				}
				else {map.put(arr[i], i);}
				
			}
			

		}


	
	
	public static boolean amazon() {
		String name ="amazon";
		int n= name.length();
		String name2="azonam";
		int k=2;
				
		String s11= name.substring(0,k);
		String s12= name.substring(k,n);
		String mod1= s12+s11;
		
		//System.out.println(mod1);
		
		String s21= name.substring(0,n-k);
		String s22= name.substring(n-k,n);
		String mod2= s22+s21;
		//System.out.println(mod2);
		
		if(name2.equals(mod2)||name2.equals(mod1)) {return true;}
		else {return false;}

				 

	}
	


	

  



	public static void main(String[] args) {
		//string_manipluation();
		//System.out.println(amazon());
		duplicates();
		
		
		
		

	
}
	}


