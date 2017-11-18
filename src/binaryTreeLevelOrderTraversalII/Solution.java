package binaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		if (root == null)
			return res;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while(!q.isEmpty()) {
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
			res.add(0,list);
		}
		

		return res;
	}
}
