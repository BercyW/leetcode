package findRelativeRanks;

public class Solution {
	public String[] findRelativeRanks(int[] nums) {
		
		
		String[] s = new String[nums.length];
		if(nums.length==1){
			s[0] = "Gold Medal";
			return s;
		}
		if(nums.length==2){
			if(nums[0]>nums[1]) {
			s[0] = "Gold Medal";
			s[1] = "Silver Medal";
			}else {
				s[0] = "Silver Medal";
				s[1] = "Gold Medal";
			}
			return s;
		}
		
		int[] array = new int[nums.length];
		int index = 0;
		int count = 0;
		while (count < nums.length) {
		
			for (int i = 0; i < nums.length; i++) {
				if (nums[index] < nums[i]) {
					index = i;
					
				}
			}

			array[count] = index;
			nums[index] = -1;
			count++;
		}
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]);
	}

		s[array[0]] = "Gold Medal";
		s[array[1]] = "Silver Medal";
		s[array[2]] = "Bronze Medal";
		for (int i = 3; i < nums.length; i++) {
			s[array[i]] = i + 1 + "";
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(s[i]);
		}

		return s;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {123123,11921,1,0,123};
		s.findRelativeRanks(nums);
	}
}
