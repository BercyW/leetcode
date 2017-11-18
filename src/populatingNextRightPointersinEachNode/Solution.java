package populatingNextRightPointersinEachNode;

import java.util.*;

public class Solution {
	public void connect(TreeLinkNode root) {
	    if(root==null) return;
		Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			TreeLinkNode prev = null;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeLinkNode t = q.poll();
				t.next = prev;
				prev = t;
				if (t.right != null) {
					q.offer(t.right);
				}
				if (t.left != null) {
					q.offer(t.left);
				}
			}
		}
	}
}
