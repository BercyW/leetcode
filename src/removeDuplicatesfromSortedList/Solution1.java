package removeDuplicatesfromSortedList;

public class Solution1 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode fakeHead = head;
		while (head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}

		}

		return fakeHead;
	}
}
