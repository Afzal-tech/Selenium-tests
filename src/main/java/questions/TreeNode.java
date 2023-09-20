package questions;

// implematation to find parent node of a given  child noode usirn binary tree

public class TreeNode { // this is creation of binary tree
	int val;
	public TreeNode left;
	public TreeNode right;
	
	

	public TreeNode(int val) {
		
		this.val = val;
		this.right = null;
		this.left = null;
				
	}



	public static void main(String[] args) {
		Binary_tree tree= new Binary_tree();
		
		TreeNode root = new TreeNode(5);
		root.left =new TreeNode(5);
		root.right =new TreeNode(4);
		
		root.left.left =new TreeNode(2);
		root.left.right =new TreeNode(2);
		root.right.left =new TreeNode(4);
		
		TreeNode child=root.left.left;
		
		 TreeNode parent= tree.find_parent(root, child);
		 
		 if (parent!=null) {
			 System.out.println(parent.val);
		 }
			 
			 else {
				 System.out.println("not found");
			 }
			 
		 }
	

}
class Binary_tree{ // logic
	
	public TreeNode find_parent(TreeNode root, TreeNode child) {
		if (root==child || root==null) return null;
		
		if (root.left== child || root.right==child) return root;
		
		TreeNode leftparent = find_parent(root.left, child);
		TreeNode rightparent = find_parent(root.right, child);
		 
		if(leftparent!= null)return leftparent;
		
		else {return rightparent;}
	}
	
}
