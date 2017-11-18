package constructBinaryTreefromPreorderandInorderTraversal;

public class Solution1 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return build(preorder,0,inorder,0,inorder.length-1);
	}
	public TreeNode build(int[] preorder,int preStart,int[] inorder,int inStart,int inEnd) {
		if(preStart>preorder.length-1||inStart>inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int index = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if(inorder[i] == root.val) {
				index = i;
			}
		}
		root.left = build(preorder,preStart+1,inorder,inStart,index-1);
		root.right = build(preorder,preStart+1+index-inStart,inorder,index+1,inEnd);
		
		
		return root;
	}
}
