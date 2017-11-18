package constructBinaryTreefromInorderandPostorderTraversal;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return building(inorder, 0, inorder.length - 1, postorder,0, postorder.length-1);
	}

	public TreeNode building(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd) {
		if(inStart>inEnd || postStart>postEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[postEnd]);
		int rootVal = root.val;
		int index = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if(rootVal == inorder[i]) {
				index = i;
			}
		}
		
		root.right = building(inorder,index+1,inEnd,postorder,postStart,postEnd-1);
		root.left = building(inorder,inStart,index-1,postorder,postStart,postEnd-1-index-inStart);
		
		
		
		return root;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] inorder = {3,2,1};
		int[] postorder = {3,2,1}; 
		s.buildTree(inorder, postorder);
	}
}
