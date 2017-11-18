package balancedBinaryTree;

public class Solution {

	public boolean isBalanced(TreeNode root) {
		if(root== null) return true;
		
		int left = checkBal(root.left);
		int right = checkBal(root.right);
		int diff = left-right;
		if(diff>1 || diff<-1) {
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
		
	}
	public int checkBal(TreeNode root) {
		if(root==null) return 0;
		int left = checkBal(root.left);
		int right = checkBal(root.right);
		
		return Math.max(left, right) + 1; 
	}
}
