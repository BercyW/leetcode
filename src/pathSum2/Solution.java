package pathSum2;

import java.util.*;

/*
 * 答案错误 
 * sum1=sum1+t.val 少加一个节点
 */
public class Solution {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;

		Stack<TreeNode> node = new Stack<TreeNode>();
		List<Integer> value = new ArrayList<Integer>();
		Stack<Integer> sumList = new Stack<Integer>();
		node.push(root);
		sumList.push(root.val);
		int sum1 = sum;
		int rootVal = root.val;
		while (!node.isEmpty()) {
			TreeNode t = node.pop();
			value.add(t.val);
 			int sumV=sumList.pop();
			if (t.left == null && t.right == null) {
				if (sumV == sum1) {
					res.add(new ArrayList<Integer>(value));
					value.clear();
					value.add(rootVal);
				}else {
					value.remove(value.size()-1);
				}

			} else {

				if (t.right != null) {
					node.push(t.right);		
					sumList.push(sumV+t.right.val);
				}
				if (t.left != null) {
					node.push(t.left);
					sumList.push(sumV+ t.left.val);
				}

			}

		}

		return res;
	}

	// [5,4,8,11,null,13,4,7,2,null,null,5,1]
	public static void main(String[] args) {
		Solution s = new Solution();
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

		System.out.println(s.pathSum(t1, 22));
	}
}
