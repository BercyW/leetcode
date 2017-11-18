package pathSum2;

import java.util.*;

public class Solution1 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		findPathSum(root, sum, res, list);
		return res;
	}

	public void findPathSum(TreeNode root, int sum, List<List<Integer>> res, List<Integer> list) {
		if (root == null)
			return;

		list.add(root.val);
		sum = sum - root.val;

		if (root.left == null && root.right == null) {
			if (sum == 0) {
				res.add(new ArrayList<Integer>(list));
			}
		} else {

			if (root.left != null) {
				findPathSum(root.left, sum, res, list);
			}
			if (root.right != null) {
				findPathSum(root.right, sum, res, list);
			}

		}
		list.remove(list.size() - 1);

	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
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

		System.out.println(s1.pathSum(t1, 22));
	}
}
