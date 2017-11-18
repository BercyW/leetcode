package Base7;

public class Solution {
	   public String convertTo7(int num) {
		   if(num == 0) return "";
		   
		   int absValue = Math.abs(num);
		   String s = "";
		   
		   while(absValue>=7) {
			   s = absValue%7+s;
			   absValue /=7;
			   
		   }
		   s = absValue+s;
		   
		   
	        return num<9?"-"+s:s;
	    }
	   public static void main(String[] args) {
		Solution s = new Solution();
	System.out.println(s.convertTo7(99));
	}
}
