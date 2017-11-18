package removeNthNodeFromEndofList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	   public ListNode removeNthFromEnd(ListNode head, int n) {
		   if(head == null || head.next == null)
               return null;
               
           ListNode faster = head;
           ListNode slower = head;
           
           for(int i = 0; i<n; i++)
               faster = faster.next;
              
          if(faster == null){
              head = head.next;
              return head;
          }
          
          while(faster.next != null){
              slower = slower.next;
              faster = faster.next;
          }
          
          slower.next = slower.next.next;
          return head;
	   }
	   
	   public static void main(String[] args) {
		  
		   
		   ListNode a = new ListNode(5);
		   ListNode b = new ListNode(4);
		 //  ListNode c = new ListNode(3);
		  // ListNode d = new ListNode(2);
		   //ListNode e = new ListNode(1);
		   a.next=b;
		   b.next=null;
		   //c.next=d;
		   //d.next=e;
		   //e.next=null;
//		  System.out.println(a.val);
//		  System.out.println(b.val);
//		  System.out.println(c.val);
//		  System.out.println(d.val);
//		  System.out.println(e.val);
		   Solution s = new Solution();
		   s.removeNthFromEnd(a, 1);
		 
		   
		   System.out.println("-----------------");
		   System.out.println(a.next.val);
			   
	}
}
