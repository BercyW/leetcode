package symmetricTree;

;

public class Solution1 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		return isSymmetricTree(root.left, root.right);

	}
	
	public boolean isSymmetricTree(TreeNode t1, TreeNode t2) {
		if(t1==null && t2 == null ) return true;
		if(t1==null || t2 == null ) return false;
		
		return t1.val == t2.val && isSymmetricTree(t1.left,t2.right) && isSymmetricTree(t1.right, t2.left);
	}
}
