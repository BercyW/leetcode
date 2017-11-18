package balancedBinaryTree;

public class Solution1 {
	public boolean isBalanced(TreeNode root) {
		int leftLen = maxLen(root.left);
		int rightLen = maxLen(root.right);
		return (leftLen-rightLen>1||leftLen-rightLen<-1)?false:true;
	}
	
	public int maxLen(TreeNode root) {
		if(root == null) return 0;
		int left = maxLen(root.left);
		int right = maxLen(root.right);
		
		return Math.max(left, right)+1;
	}
}
