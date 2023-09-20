package collections.practice;

import java.util.Stack;

public class TreeNode {
	int val;
	 TreeNode left;
	 TreeNode right;
	
// thjis is apractice one.. please delete this.. orignal exists somewhere
	public TreeNode(int val) {
		
		this.val = val;
		this.left=null;
		this.right=null;
	}
public static void main(String[] args) {
	Binary_Tree tree = new Binary_Tree();
		TreeNode root = new TreeNode(10);
		root.left =new TreeNode(5);
		root.right =new TreeNode(4);
		
		root.left.left =new TreeNode(2);
		root.left.right =new TreeNode(8);
		root.right.left =new TreeNode(4);
		root.right.right =new TreeNode(12);
		root.right.right.right =new TreeNode(19);
		root.right.right.left =new TreeNode(1);
		
		
		//TreeNode child1 =root.left.right;
		//TreeNode child1 =root.right.right.left;
		//TreeNode child2 =root.right.left;
		
		
	tree.sum(root);

	}
}
	
	class Binary_Tree {
		int current_sum;
	public void  sum(TreeNode root) {
		int current_sum =root.val;
		
		Stack<TreeNode > stack = new Stack<>();
		stack.push(root);
		
		
		while(!stack.isEmpty()) {
			 TreeNode current= stack.pop();
			 
			 if (current.left==null && current.right==null) {
				 System.out.println(" "+ current.val);
				 
			 }
			 
			 if(current.left!=null) {
				
				
				
				 stack.push(current.left);
			 }
			 if(current.right!=null) {
				
				 
				
				 stack.push(current.right);
			 }
			
		}
		 
	
		
	}
}
