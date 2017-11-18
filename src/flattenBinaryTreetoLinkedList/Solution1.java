package flattenBinaryTreetoLinkedList;

import java.util.Stack;
/*
 * leetcode 不通过
 */
public class Solution1 {
	public void flatten(TreeNode root) {
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode prev = root;
		while(!stack.isEmpty()) {
			TreeNode t = stack.pop();
			if(t.right!=null) {
				stack.push(t.right);
			}
			if(t.left != null) {
				stack.push(t.left);
			}
			prev.right = t;	
			prev.left = null;
			prev = t;
		}
		root = prev.right;
	}
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		
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

		s1.flatten(t1);	
		System.out.println(t1.val);
	
		System.out.println(t1.right.val);
		System.out.println(t2.right.val);
		System.out.println(t3.right.val);
		System.out.println(t4.right.val);
		System.out.println(t5.right.val);
		
		
	}
}
