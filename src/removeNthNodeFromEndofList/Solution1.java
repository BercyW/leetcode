package removeNthNodeFromEndofList;

public class Solution1 {
	public static void main(String[] args) {

		ListNode a = new ListNode(5);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;

		Solution1 s1 = new Solution1();
		s1.removeNthFromEnd(a, 2);

		System.out.println("-----------------");
		for (int i = 0; i < 2; i++) {
			System.out.println(a.next.val);
			a = a.next;

		}

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if (head == null || head.next == null)
			return null;

		ListNode fast = head;
		ListNode slow = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;

		}
		slow.next = slow.next.next;

		return head;
	}
}
