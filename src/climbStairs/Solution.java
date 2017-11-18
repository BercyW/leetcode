package climbStairs;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.climbStairs(5));
		
	}
	 public int climbStairs(int n) {
		 if(n==0 || n == 1 || n == 2) 
			 return n;
		 
		 int d[] = new int[n+1];
		 d[0] = 0 ;
		 d[1] = 1;
		 d[2] = 2;
		 
		 for (int i = 3; i < n+1; i++) {
			d[i] = d[i-1]+d[i-2];
		}
		 return d[n];
	 }
}
