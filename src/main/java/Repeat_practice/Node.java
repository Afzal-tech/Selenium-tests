package Repeat_practice;

import java.util.LinkedList;

public class Node {
	 
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>() ;
		list.add(10);
		list.add(20);
		list.addFirst(40);
		
		
		//System.out.println(list);
		
		Linked_list_implementaion lists = new Linked_list_implementaion();
		lists.addFirst(20);
		
		lists.print();
		
	}

}
