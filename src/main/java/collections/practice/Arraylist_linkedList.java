package collections.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_linkedList {
	
	
	
	
	

	public static void main(String[] args) {
		
		List<Integer> arraylist  = new ArrayList<Integer>();
	    List<Integer>linkedlist  = new LinkedList<Integer>();
		
		arraylist.add(100);
		arraylist.add(1);
		arraylist.add(19);
		arraylist.add(20);
		arraylist.add(11);
		 linkedlist.add(20);
		 linkedlist.add(23);
		 linkedlist.add(2);
		 linkedlist.add(44);
		 linkedlist.add(550);
		 
		System.out.println(linkedlist.get(3)); 
		
		 
		 
			 do_Timings("ArrayList",arraylist);
			 do_Timings("LinkList",linkedlist);
		
	}
	private static void do_Timings(String type, List<Integer> list) {
		
		long start= System.currentTimeMillis();
		for (int i=0; i<1E5;i++) {
			list.add(0,i);
			
		}
		
		for (int i=0; i<1E5;i++) {
			list.add(i);
			
		}
		
		
		
		
		
		long end= System.currentTimeMillis();
		
		System.out.println("tatal time "+(end-start)+ " ms in"+type);
		 
		 }

	}


