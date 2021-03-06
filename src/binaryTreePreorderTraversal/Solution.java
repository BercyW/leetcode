package binaryTreePreorderTraversal;

import java.util.*;

public class Solution {
	List<Integer> list = new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
	
		if (root == null)
			return list;
		list.add(root.val);

		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return list;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		t3.left = t5;
		System.out.println(s.preorderTraversal(t1));
	}
}
