package collections.binarytree;

//post order traversal

public class Sum_nodes_recursion_post_order {
	
	public static int post_order_sum_recursion(TreeNode root) {
		
		if (root!=null) {
		return post_order_sum_recursion(root.left)+post_order_sum_recursion(root.right);

		}
		return -1;
	}
	
	
	public static  void  post_order_values_recursion(TreeNode root) {
		
		if (root!=null) {
			post_order_values_recursion(root.left);
			post_order_values_recursion(root.right);
			System.out.println(" "+root.val);

		}

	}

	public static void main(String[] args) {
		
Sum_nodes_recursion_post_order tree = new Sum_nodes_recursion_post_order();
		
		TreeNode root = new TreeNode(10);
		root.left =new TreeNode(5);
		root.right =new TreeNode(4);
		
		root.left.left =new TreeNode(2);
		root.left.right =new TreeNode(8);
		root.right.left =new TreeNode(4);
		root.right.right =new TreeNode(12);
		root.right.right.right =new TreeNode(19);
		root.right.right.left =new TreeNode(1);
		// TODO Auto-generated method stub
		
	post_order_sum_recursion(root);
		System.out.println(post_order_sum_recursion(root));
		//post_order_values_recursion(root);

	}

}
