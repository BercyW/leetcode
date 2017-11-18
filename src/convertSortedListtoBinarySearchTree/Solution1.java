package convertSortedListtoBinarySearchTree;

public class Solution1 {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		return building(head, null);
	}

	public TreeNode building(ListNode head, ListNode tail) {
		ListNode fast = head;
		ListNode slow = head;
		if (head == tail)
			return null;
		while (fast != tail && fast.next != tail) {
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = building(head, slow);
		root.right = building(slow.next, tail);
		return root;

	}
}
