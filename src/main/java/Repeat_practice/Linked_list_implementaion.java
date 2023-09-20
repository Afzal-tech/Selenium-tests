package Repeat_practice;

public class Linked_list_implementaion {


	private class Node {

		private int value;
		private Node next;

		private Node(int value) {
		this.value = value;
		}

	}

	private Node first;
	private Node last;
	
	
	public void addFirst(int item) {

		Node node= new Node(item);
		
		if (first==null){
			first=last=node;}	
		else {
		
		node.next= first;
		first= node;	}	
	}
	

	public void print() {
		Node current =first;
		System.out.println(current.value);
		
		//while(current!=last.next) {
		while(current!=null) {
			System.out.println(current.value);
			current =current.next;
		}
	}

 

}
