package collections.binarytree;

// all are pre order reversal techniques where we traverse fro m root to left node to right node



public class Leaf_recursion_pre_order {
	
	public static int leaf_count_recursion(TreeNode root) {
		
		if (root==null) return 0;
		if (root.left== null && root.right== null ) return 1;
		
		return leaf_count_recursion(root.left)+leaf_count_recursion(root.right) ;
		 
	}
	
public static void leaf_value_recursion(TreeNode root) {
		
		if (root==null) return;
		if (root.left== null && root.right== null ) System.out.print(" "+root.val);
		
		leaf_value_recursion(root.left);
		leaf_value_recursion(root.right);
		 
	}

public static int sum_leaf_recursion(TreeNode root) {
	
	
	if (root==null) return 0;
	
	if (root.left== null && root.right== null ) {
		 return root.val;
		 
		
	}
	
	int left_sum=sum_leaf_recursion(root.left);
	int right_sum=sum_leaf_recursion(root.right);
	
	return left_sum+right_sum;
	 
}
	
	
	

	public static void main(String[] args) {
		
		Leaf_recursion_pre_order tree = new Leaf_recursion_pre_order();
		
		TreeNode root = new TreeNode(10);
		root.left =new TreeNode(5);
		root.right =new TreeNode(4);
		
		root.left.left =new TreeNode(2);
		root.left.right =new TreeNode(8);
		root.right.left =new TreeNode(4);
		root.right.right =new TreeNode(12);
		root.right.right.right =new TreeNode(19);
		root.right.right.left =new TreeNode(1);
		
		
		//System.out.println(leaf_count_recursion(root));
		//leaf_value_recursion(root);
		System.out.println(sum_leaf_recursion(root));


	}

}
