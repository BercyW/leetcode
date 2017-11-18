package pathSum2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution3 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		int sVal = 0;

		while (!stack.isEmpty()) {
			TreeNode t = stack.pop();
			list.add(t.val);
			sVal = sVal + t.val;

			if (t.right != null) {
				stack.add(t.right);
			}
			if (t.left != null) {
				stack.add(t.left);
			}

			if (t.left == null && t.right == null) {
				if (sVal == sum) {
					res.add(new ArrayList<Integer>(list));
					list.clear();
					list.add(root.val);
					sVal = root.val;
				} else {
					list.remove(list.size() - 1);
					sVal = sVal - t.val;
				}
			} else if (t.left == null || t.right == null) {
				if (sVal + stack.peek().val != sum) {
				list.remove(list.size()-1);
					sVal = sVal - t.val;

				}
				
			}

		}
		return res;
	}

	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(11);
		TreeNode t5 = new TreeNode(13);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(2);
		TreeNode t9 = new TreeNode(5);
		TreeNode t10 = new TreeNode(1);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = null;
		t3.left = t5;
		t3.right = t6;
		t4.left = t7;
		t4.right = t8;
		t6.left = t9;
		t6.right = t10;

		System.out.println(s3.pathSum(t1, 22));
	}
}
