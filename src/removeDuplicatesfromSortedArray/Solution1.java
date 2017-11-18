package removeDuplicatesfromSortedArray;

public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		int[] nums = { 1,1, 2, 3,3 };
		System.out.println(s1.removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

	public int removeDuplicates(int[] nums) {
		int len = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[len]!=nums[i]) {
				nums[++len] = nums[i];
			}
		}

		return len;
	}
}
