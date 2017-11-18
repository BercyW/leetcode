package binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> postorderTraversal(TreeNode root) {

		if (root == null)
			return list;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		list.add(root.val);

		return list;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		// TreeNode t4 = new TreeNode(4);
		// TreeNode t5 = new TreeNode(5);
		t1.left = null;
		t1.right = t2;
		t2.left = t3;

		// t2.right = t4;
		// t3.left = t5;
		System.out.println(s.postorderTraversal(t1));
	}
}