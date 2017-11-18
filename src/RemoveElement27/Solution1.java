package RemoveElement27;

public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		int[] nums = {2,3,4,5,3};
		System.out.println(s1.removeElement(nums, 2));
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}
	 public int removeElement(int[] nums, int val) {
		 int len = 0;
		 
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				if(nums[i]!=nums[len]) {
					nums[len] = nums[i];
				}
				len++;
			}
		}
		 
		 return len;
	 }
	 
}
