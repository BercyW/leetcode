package convertSortedArraytoBinarySearchTree;

public class Solution {
	 public TreeNode sortedArrayToBST(int[] nums) {
		 return buildTree(nums,0,nums.length-1);
	 }
	 public TreeNode buildTree(int[] nums, int start, int end) {
		 if(start>end) {
			 return null;
		 }
		 int mid = (start+end)/2;
		 TreeNode t = new TreeNode(nums[mid]);
		 t.left = buildTree(nums,start,mid-1);
		 t.right = buildTree(nums,mid+1,end);
		 return t;
	 }
}
