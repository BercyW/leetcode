package RemoveElement27;
/*
 * 思路就是让不相等后面一位覆盖到相等数的位置上。
 */
public class Solution {
	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0)
			return 0;

		int len = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				if (nums[i] != nums[len]) {
					nums[len] = nums[i];
				}

				len++;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 2, 3, 4, 5, 3 };
		System.out.println(s.removeElement(nums, 2));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

}
