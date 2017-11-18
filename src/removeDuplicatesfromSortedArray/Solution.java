package removeDuplicatesfromSortedArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
	
		if(nums == null || nums.length==0) return 0; 
		
		int size = 0 ;

	        for (int i = 0; i < nums.length; i++) { 
	            if (nums[i] != nums[size]) {
	                nums[++size] = nums[i];
	            }
	        }
	        return size + 1;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,1,2,3};
		System.out.println(s.removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
}
