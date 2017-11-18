package minimumDepthofBinaryTree;

public class Solution1 {
	public int minDepth(TreeNode root) {
		if(root==null) return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		if(left==0 || right == 0) {
			return (left>=right)?left+1:right+1;
		}
		
		return Math.min(left, right)+1;
	}
}
