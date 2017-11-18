package sumRoottoLeafNumbers;

public class Solution {
	StringBuilder sb = new StringBuilder();
	int sum = 0;

	public int sumNumbers(TreeNode root) {

		if (root == null)
			return 0;
		sb.append(root.val);

		if (root.left == null && root.right == null) {

			int num = Integer.parseInt(sb.toString());
			sum += num;
			sb.deleteCharAt(sb.length() - 1);
		} else {
			sumNumbers(root.left);
			sumNumbers(root.right);
			sb.deleteCharAt(sb.length() - 1);
		}
		return sum;
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
		t2.right = t4;
		t3.left = t5;
		System.out.println(s.sumNumbers(t1));
	}

}
