package symmetricTree;

public class Solution2 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		return check(root.left, root.right);
	}

	public boolean check(TreeNode l, TreeNode r) {
		if (l == null && r == null)
			return true;
		if (l == null || r == null)
			return false;
		return (l.val == r.val) && check(l.left, r.right) && check(l.right, r.left);
	}
}
