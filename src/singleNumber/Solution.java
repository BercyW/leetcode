package singleNumber;

public class Solution {
	public int singleNumber(int[] nums) {
		int num = 0;

		for (int i = 0; i < nums.length; i++) {
			num ^= nums[i];
		}

		return num;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1,1,2,5,2,7 ,7};
		System.out.println(s.singleNumber(nums));
	}
}
