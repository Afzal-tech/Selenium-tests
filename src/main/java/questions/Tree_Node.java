package questions;


/// binary tree to b=find the count of leaf nodes//
public class Tree_Node {
	 int value;
	 Tree_Node left;
	 Tree_Node right;
	 
	 
	public Tree_Node(int value) {
		
		this.value = value;
		this.left = null;
		this.right = null;
	 

}
	
	 public static void main(String[] args) {
			Tree_Node root = new Tree_Node(10);
			root.left =new Tree_Node(5);
			root.right =new Tree_Node(4);
			
			root.left.left =new Tree_Node(2);
			root.left.right =new Tree_Node(2);
			root.right.left =new Tree_Node(4);
			//root.right.right =new Tree_Node(4);
			
			
			Binary_tree_leaf_count obj = new Binary_tree_leaf_count();
			
			System.out.println(obj.leaf_count(root));

		}
}


  class Binary_tree_leaf_count{
	  
	  public int leaf_count(Tree_Node root) {
		  
		  if (root==null) {return 0;}
		  
		  if (root.left==null && root.right==null) {
			  return 1;
		  }
		  
		  
		  
		  return leaf_count(root.left)+leaf_count(root.right);
	  }
	 
	 
	 
	 
	 
	
	
}





