package linkedlists;

import java.util.NoSuchElementException;

public class Linked_List {
	
	private class Node {
		
		private int value;
		private Node next;
		
		public Node (int value) {
			this.value = value;
		}

	}

	private Node first;
	private Node  last;

	public void addLast(int item) {
	Node node = new Node(item);
	//System.out.println("debug1");
	//System.out.println(item);

		//node.value =item;
		if (first==null) {
		first = last =node;}
	//	System.out.println("first "+first);}
		
		else {
			last.next = node;
		// check this node.next= last;
		 last = node;
		 System.out.println("last "+ last);}


	}

	
	public void addfirst(int item) {

		Node node = new Node(item);
		//System.out.println("debug1");

		//node.value =item;
		if (isEmpty( )) 
		first = last =node;
		
		else {
		 node.next= first;
		 first = node;
		 }
	}
    
	private boolean isEmpty() {
		return first==null;
			
	}
	public int indexOf(int item) {
		System.out.println("index "+item);
		int index =0;
		Node current = first;
		System.out.println("first "+current);
		System.out.println("value "+ current.value);
		
		while(current !=null) {
			if(current.value ==item) {
			System.out.println("value "+ current.value);
				return index;		
			}
			
			current= current.next;  
			index++;			
		}
		
		  return  -1;		
		
	}
	public void deleteFirst() {
		Node second= first.next;
		first.next= null;
		first =second;
		
		
	}
	
	public void deleteLast() {
		if (isEmpty())
			throw  new NoSuchElementException();
		if (first== last) {
			first= last= null;
			return;
		}
			
			
		Node previous =previousNode(last);
		previous.next= null;
		last=previous;
		
	}
	
	
	public Node previousNode(Node node) {
		Node current = first;
		while (current.next !=null) {
			if(current.next==node)return current;
			current= current.next;
			
		}
		return null;
	
		
	}
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public void print() {
		Node current = first;
		while(current!=last.next) {
			System.out.print(current.value+" -->");
			current = current.next;
		}
		
		
	}
	


}
