package maximumDepthofBinaryTree;

public class Solution1 {
	
	public int maxDepth(TreeNode root) {
		
		if (root == null)
			return 0;

		int leftmax = maxDepth(root.left);

		int rightmax = maxDepth(root.right);
		
		return Math.max(leftmax, rightmax) + 1;
	}
public static void main(String[] args) {
		
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);

		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		Solution1 s = new Solution1();
		System.out.println(s.maxDepth(t1));

	}
}
