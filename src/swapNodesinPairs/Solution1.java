package swapNodesinPairs;

public class Solution1 {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode fakehead = new ListNode(-1);
		ListNode p1 = fakehead;
		ListNode p2 = head;
		while(p2!=null  && p2.next!=null) {
			ListNode nextStart = p2.next.next;
			p2.next.next = p2;
			p1.next = p2.next;
			p2.next = nextStart;
			p1=p2;
			p2=p2.next;
			
		}
		
		
		
		
		
		return fakehead.next;
	}

}
