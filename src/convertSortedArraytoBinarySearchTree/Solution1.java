package convertSortedArraytoBinarySearchTree;

public class Solution1 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return building(nums,0,nums.length-1);
	}
	public TreeNode building(int[] nums, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = building(nums,start,mid);
		root.right = building(nums,mid+1,end);
		return root;
	}
}
