package pathSum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null ) return false;
		Queue<TreeNode> node = new LinkedList<TreeNode>();
		Queue<Integer> value = new LinkedList<Integer>();
		node.offer(root);
		value.offer(root.val);

		while (!node.isEmpty()) {
			TreeNode t = node.poll();
			int pathAdd = value.poll();
			if (t.left == null && t.right == null && sum == pathAdd) {
				return true;
			}
			if(t.left!=null) {
				node.offer(t.left);
				value.offer(t.left.val+pathAdd);
			}if(t.right!=null) {
				node.offer(t.right);
				value.offer(t.right.val+pathAdd);
			}
		}
		return false;
	}
}
