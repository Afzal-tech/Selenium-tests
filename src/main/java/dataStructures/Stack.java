package dataStructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

	ArrayList<T> element= new ArrayList<>();

	//add items
	public void push(T item) {
		element.add(item);
	}
	
	//remove top item
	public  T pop() {
		if (element.isEmpty()) {
			throw new  EmptyStackException();
		}
		return element.remove(element.size()-1);
	}
	
	//show top item
	public T peek() {
		if (element.isEmpty()) {
			throw new  EmptyStackException();
		}

		return (element.get(element.size()-1));
	}
	
	//size
	public int  size() {
		return element.size();

	}
	//empty check
	public boolean isEmpty() {

		return element.isEmpty();

	}


	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		
		System.out.println(st.peek());

	}

}
