package findLargestElementinEachRow;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	public int[] findValueMostElement(TreeNode root) {
		int[] aNull = null;
		if (root == null)
			return aNull;
	
		List<Integer> maxList = new ArrayList<Integer>();

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int size = q.size();

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
			int max = Collections.max(list);

			maxList.add(max);

		}
		
		
		int[] res = new int[maxList.size()];
		for (int i = 0; i < maxList.size(); i++) {
			res[i] = maxList.get(i);
		}
		return res;

	}

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
		t2.left = t4;
		t2.right = t7;
		t3.left = t5;
		t3.right = t6;

		Solution s = new Solution();
	int[]  a =	s.findValueMostElement(t1);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
}
