package questions;

import java.util.Stack;

public class Stack_Paranthesis {
	public static boolean paranthesis() {
		char[] arr = {'(','{','}',')','[',']'};
		
		Stack<Character> stack =  new Stack<Character>();
		
		for (int i=0; i<arr.length; i++) {
			char c= arr[i];
			if (c=='(' || c=='['||c=='{')stack.push(c);
			else if (stack.empty()) return false;

			
	   else if (stack.peek()=='('&& c==')' &&!stack.empty())stack.pop();
	   else if (stack.peek()=='['&& c==']' &&!stack.empty())stack.pop();
	   else if (stack.peek()=='{'&& c=='}' &&!stack.empty())stack.pop();
			
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		System.out.println(paranthesis());

	}

}
