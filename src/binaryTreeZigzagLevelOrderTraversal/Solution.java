package binaryTreeZigzagLevelOrderTraversal;

import java.util.*;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<TreeNode>();

		q.offer(root);
		int flag = 0;
		while (!q.isEmpty()) {

			int size = q.size();
			List<Integer> list = new ArrayList<Integer>();

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
			if (flag == 0) {
				res.add(list);
				flag = 1;
			} else if (flag == 1) {
				Collections.reverse(list);
				res.add(list);
				flag = 0;
			}
		}

		return res;
	}
}
