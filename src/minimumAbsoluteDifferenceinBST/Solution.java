package minimumAbsoluteDifferenceinBST;

import java.util.*;

public class Solution {
	int min = Integer.MAX_VALUE;
	Integer prev;
	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return min;
		getMinimumDifference(root.left);
		
		if(prev!=null) {
			min = Math.min(min, root.val-prev);
		}
		
		prev = root.val;
		
		getMinimumDifference(root.right);
		
		return min;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(5);
		TreeNode t5 = new TreeNode(6);
		
		t1.left = null;
		t1.right = t2;
		t2.left=t3;
		t2.left=t5;
	

		System.out.println(s.getMinimumDifference(t1));
	}

}
