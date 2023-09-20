package dataStructures;

// implemenatation of  findingn common root of 2 employeess

public class TreeNode {
	
	 // this is creation of binary tree
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
			root.left =new TreeNode(21);
			root.right =new TreeNode(18);
			
			root.left.left =new TreeNode(2);
			root.left.right =new TreeNode(3);
			root.right.left =new TreeNode(4);
			root.right.right =new TreeNode(6);
			root.right.right.left =new TreeNode(9);
			
			
			TreeNode child1=root.right.right;
			TreeNode child2 =root.right.right.left;
			
			 TreeNode parent= tree.find_parent(root, child1, child2);
			 
			 if (parent!=null) {
				 System.out.println(parent.val);
			 }
				 
				 else {
					 System.out.println("not found");
				 }
				 
			 }
		

	}
	class Binary_tree{ // logic
		
		public TreeNode find_parent(TreeNode root, TreeNode child1, TreeNode child2 ) {
			if (root==null) return null;
			
			if ((root==child1 || root==child2) )return root;
			
			TreeNode leftparent = find_parent(root.left, child1, child2);
			TreeNode rightparent = find_parent(root.right, child1, child2);
			
			
			
			 
			if(leftparent!= null && rightparent!=null) return root;
			
			return (leftparent!= null )? leftparent:rightparent;
		}
		
	}
	


