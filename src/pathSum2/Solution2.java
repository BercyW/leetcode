package pathSum2;

import java.util.*;

public class Solution2 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		findPathSum(res, list, root, sum);
		return res;
	}

	public void findPathSum(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum) {
		if (root == null)
			return;

		list.add(root.val);
		sum -= root.val;
		if (root.left == null && root.right == null) {
			if (sum == 0) {
				res.add(new ArrayList<Integer>(list));
			}
		} else {
			if (root.left != null) {
				findPathSum(res, list, root.left, sum);
			}
			if (root.right != null) {
				findPathSum(res, list, root.right, sum);
			}
		}
		list.remove(list.size()-1);
	}

	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
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

		System.out.println(s2.pathSum(t1, 22));
	}
}