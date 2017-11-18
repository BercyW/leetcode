package nextGreaterElement;

import java.util.Arrays;

public class Solution {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {

		int[] newArray = new int[findNums.length];

		for (int i = 0; i < findNums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (findNums[i] == nums[j]) {
					for (int j2 = j; j2 < nums.length; j2++) {
						if(nums[j]<nums[j2]) {
							newArray[i] = nums[j2];
							break;
						}else {
							newArray[i]=-1;
						
						}
					}
				}
			}

		}

		return newArray;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] findNums = { 4,1,2 };
		int[] nums = { 1,3,4,2};
		int[] abc = s.nextGreaterElement(findNums, nums);
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
		}

	}
}
