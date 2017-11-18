package constructBinaryTreefromPreorderandInorderTraversal;

public class Solution2 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(preorder,0,inorder,0,inorder.length-1);
	}
	public TreeNode buildTree(int[] pre,int preStart,int[] inorder,int inStart,int inEnd) {
		if(preStart>pre.length-1|| inStart>inEnd) return null;
		
		TreeNode root = new TreeNode(pre[preStart]);
		int index = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if(inorder[i]==root.val) {
				index = i;
			}
		}
		
		root.left = buildTree(pre,preStart+1,inorder,inStart,index-1);
		root.right = buildTree(pre,preStart+1+(index-inStart),inorder,index+1,inEnd);
		return root;
	}
}
