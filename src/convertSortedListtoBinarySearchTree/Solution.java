package convertSortedListtoBinarySearchTree;

import java.util.*;


public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null) return null;
		if(head.next == null) return new TreeNode(head.val);
		List<Integer> list = new ArrayList<Integer>();
		while(head!=null) {
			list.add(head.val);
			head = head.next;
		}
	
		return building(list,0,list.size()-1);
	}
	public TreeNode building(List<Integer> list,int start, int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(list.get(mid));
		root.left  =  building(list,start,mid-1);
		root.right  =  building(list,mid+1,end);
		
		return root;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		l1.next = l2;
		l2.next=null;
		s.sortedListToBST(l1);
	}
}
