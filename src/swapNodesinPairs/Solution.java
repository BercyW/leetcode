package swapNodesinPairs;

public class Solution {
	  public ListNode swapPairs(ListNode head) {
		 if(head==null || head.next==null) return head;
		  
		 ListNode fakehead = new ListNode(-1);
		 
		 ListNode p1 = fakehead;
		 ListNode p2 = head;
		 
		 while(p2!=null && p2.next!=null) {
			 ListNode nextStart = p2.next.next;  //指向第三个
			 p2.next.next = p2;	 //让2 只想1
			 p1.next=p2.next;	//让假头只想2
			 p2.next=nextStart;	//让1指向3
			 p1=p2;				//指针想前移动
			 p2= p2.next;      //指针向前移动
			 
		 }
		 
		  return fakehead.next;
	    }
	  
	
	  
	  
	  
}
