package removeDuplicatesfromSortedList;

public class Solution {
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(1);
		//ListNode list3 = new ListNode(2);
		list1.next = list2;
		list2.next = null;
		//list3.next = null;
		Solution s = new Solution();
		s.deleteDuplicates(list1);
		
			System.out.println(list1.val);

		
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
	//	ListNode fakeHead =head;
	

		while (head != null && head.next!=null) {
		
			if (head.val == head.next.val) {
				head.next = head.next.next;
				
			}else {
				head	 = head.next;
			}
		
		}

		return head;
	}
}
