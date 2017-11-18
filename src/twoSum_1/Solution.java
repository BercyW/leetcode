package twoSum_1;

public class Solution {

	public int[] twoSum(int[] nums, int target) {

		int[] sum = new int[2];

		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 1; j < nums.length; j++) {
			if((nums[i])+(nums[j])==target&&i!=j) {
				sum[0]= i;
				sum[1] =j;
			}
				
			}
		}
		if (sum[0] == sum[1]) {
			System.out.println(sum[0]+":::"+sum[1]);
			
			
		}

		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { -1, -2,-3, -4,-5};
		Solution s = new Solution();
		s.twoSum(nums, -8);
	}
}
