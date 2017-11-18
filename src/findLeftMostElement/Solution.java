package findLeftMostElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;





public class Solution {
	public int findLeftMostNode(TreeNode root) {
		
		int a = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int size = q.size();
		
			for (int i = 0; i <size; i++) {
				TreeNode t = q.poll();
				list.add(t.val);
				
				if(t.left!=null) {
					q.offer(t.left);
				}
				if(t.right!=null) {
					q.offer(t.right);
				}
				
			}
			 a = list.get(0);
		}

		return a;
	}
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);

		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		Solution s = new Solution();
		System.out.println(s.findLeftMostNode(t1));

	}
}
