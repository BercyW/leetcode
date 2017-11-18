package binaryTreeLevelOrderTraversal;

import java.util.*;



public class Solution {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t2.left=t4;
		t2.right=t7;
		t3.left = t5;
		t3.right = t6;

		Solution s = new Solution();
		System.out.println(s.levelOrder(t1));

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root==null) return res;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
	
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
			res.add(list);
		}

		return res;
	}
}
