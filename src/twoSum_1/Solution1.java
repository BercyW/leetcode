package twoSum_1;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] index = new int[2];
		int slow = 0;
		while(slow<nums.length-1) {
		for (int i = slow+1; i < nums.length; i++) {
			if (slow!=i && nums[slow] + nums[i] == target) {
				index[0] = slow;
				index[1] = i;
				return index;
			} 
		}
		slow++;
		}
		return index;
	}
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] nums = {2, 7, 11, 15};
		int[] a = s.twoSum(nums, 22);
		for (int i = 0; i < 2; i++) {
			System.out.println(a[i]	);
		}
	
	}
}
