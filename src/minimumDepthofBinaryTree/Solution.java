package minimumDepthofBinaryTree;

public class Solution {
public int minDepth(TreeNode root) {
		if(root == null) return 0;
        int leftMin = minDepth(root.left);
        int rightMin = minDepth(root.right);
        if(leftMin==0 || rightMin == 0) {
        		return leftMin>=rightMin?leftMin+1:rightMin+1;
        }
        return Math.min(leftMin, rightMin)+1;
    }
public static void main(String[] args) {
	Solution s = new Solution();
	TreeNode t1 = new TreeNode(1);
	TreeNode t2 = new TreeNode(2);
	TreeNode t3 = new TreeNode(3);
	TreeNode t4 = new TreeNode(4);
	TreeNode t5 = new TreeNode(5);
	t1.left = t2;
	t1.right = t3;
	t2.left = null;
	t2.right = t4;
	t3.left = null;
	t3.right = t5;
	System.out.println(s.minDepth(t1));
}
}
