package constructBinaryTreefromInorderandPostorderTraversal;

public class Solution1 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return building(inorder,0,inorder.length-1,postorder,postorder.length-1);
	}
	public TreeNode building(int[] in,int inStart,int inEnd,int[] pos,int posStart) {
		if(inStart>inEnd || posStart<0) {
			return null;
		}
		TreeNode root = new TreeNode(pos[posStart]);
		int index = 0;
		for (int i = inStart; i < inEnd; i++) {
			if(in[i]==root.val) {
				index = i;
			}
		}
		root.right = building(in,inStart+1,inEnd,pos,posStart-1);
		root.left = building(in,inStart,index-1,pos,posStart-1-(inStart-index));
		
		return root;
	}
}
