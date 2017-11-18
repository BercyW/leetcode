package symmetricTree;
/*
 * 每次调用自身 将左边和右边分别放在里边 每次都看一个点的左边和右边。
 */
public class Solution {
	public boolean isSymmetric(TreeNode root) {

		if (root == null)
			return true;

		return isSymmetricTree(root.left, root.right);
	}

	public boolean isSymmetricTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		return (p.val == q.val) && isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
	}
}
