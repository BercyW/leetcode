package binaryTreePreorderTraversal;

import java.util.*;

public class Solution1 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root!=null) {
			list.add(root.val);
			if(root.right!=null) {
				stack.push(root.right);
			}
			root = root.left;
			if(root==null && !stack.isEmpty()) {
				root = stack.pop();
			}
			
		}
		return list;
	}
}
