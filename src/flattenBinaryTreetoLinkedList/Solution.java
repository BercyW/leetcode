package flattenBinaryTreetoLinkedList;

public class Solution {
	private TreeNode prev = null;

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		t1.left = t2;
		t1.right = t5;
		t2.left = t3;
		t2.right = t4;
		t5.right = t6;

		s.flatten(t1	);	
		System.out.println(t1.val);
		System.out.println(t1.right.val);
		System.out.println(t2.right.val);
		System.out.println(t3.right.val);
		System.out.println(t4.right.val);
		System.out.println(t5.right.val);
		
	}
}
