package collections.binarytree;

public class NodeSumValues_preorder {
	
	public static int pre_order_sum_recursion(TreeNode root) {
		
		if (root==null) return 0;
		
		//int sum = root.val;
		
		 int sum1=pre_order_sum_recursion(root.left);
		int sum2=pre_order_sum_recursion(root.right);
			
			
		
		return root.val+sum1+sum2;
		
	}
	
public static void pre_order_values_recursion(TreeNode root) {
		
		if (root==null) return;
		
		System.out.println(root.val);
		
		pre_order_values_recursion(root.left);
		pre_order_values_recursion(root.right);
			
			

	}
	
	
	

	public static void main(String[] args) {
		
	NodeSumValues_preorder tree = new NodeSumValues_preorder();
		
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
		
		System.out.println(pre_order_sum_recursion(root));
		//pre_order_values_recursion(root);

	}

}
