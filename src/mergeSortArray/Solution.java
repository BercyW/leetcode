package mergeSortArray;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int m = 5;
		int n = 5;
		int[] nums1 = new int[15];
		nums1[0] = 0;
		nums1[1] = 2;
		nums1[2] = 4;
		nums1[3] = 5;
		nums1[4] = 6;

		int[] nums2 = new int[5];
		nums2[0] = 1;
		nums2[1] = 3;
		nums2[2] = 6;
		nums2[3] = 7;
		nums2[4] = 8;

		s.merge(nums1, m, nums2, n);

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "   ");
		}

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m + n;//排序后总长度  
        while(m > 0 && n > 0){  
            if(nums1[m-1] > nums2[n-1]){  
                nums1[--len] = nums1[--m];  
            }else{  
                nums1[--len] = nums2[--n];  
            }  
        }  
        //余下的数字  
        while(m > 0){  
            nums1[--len] = nums1[--m];  
        }  
        while(n > 0){  
            nums1[--len] = nums2[--n];  
        }  

	}
}
