package binaryTreePostorderTraversal;

import java.util.*;

public class Solution2 {
	public List<Integer> postorderTraversal(TreeNode root) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode t = stack.pop();
			list.addFirst(t.val);
			if (t.left != null) {
				stack.push(t.left);
			}
			if (t.right != null) {
				stack.push(t.right);
			}
		}

		return list;
	}
}
