package maximumDepthofBinaryTree;

import java.util.LinkedList;

import java.util.Queue;

public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int count = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		int curNum = 1;
		int nextNum = 0;
		while (!q.isEmpty()) {

			TreeNode t = q.poll();
			curNum--;
			if (t.left != null) {
				q.offer(t.left);
				nextNum++;
			}
			if (t.right != null) {
				q.offer(t.right);
				nextNum++;
			}
			if (curNum == 0) {
				curNum = nextNum; 
				nextNum = 0;
				count++;
			}

		}

		return count+1;
	}

	public static void main(String[] args) {

		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(42);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		t4.left = t6;
		Solution s = new Solution();
		System.out.println(s.maxDepth(t1));

	}

}
