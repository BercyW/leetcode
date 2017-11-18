package binaryTreeLevelOrderTraversal;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);

		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		Solution2 s1 = new Solution2();
		System.out.println(s1.levelOrder(t1));

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int size = q.size();
		
			for (int i = 0; i < size; i++) {
				TreeNode t = q.poll();
				list.add(t.val);
				
				if (t.left != null) {
					q.offer(t.left);
				}
				if (t.right != null) {
					q.offer(t.right);
				}
				
			}
			res.add(list);
		}
		return res;
	}
}
