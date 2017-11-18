package reverseInteger_07;

public class Solution {
	 public int reverse(int x) {
		 long result=0;
		long temp = x;
		
		if (x < 10 && x>-10) {
			result = x;
			System.out.println(result);
			return (int) result;
		}

		while(temp!=0) {
			
			result = (result+temp%10)*10;
			 temp = temp/10;
			 if(temp<10 && temp>0) {
				result = result+temp;
				break;
			 }else if(temp<0 && temp >-10)  {
				 result = result+temp;
					break;
			 }
			 
		}
		 
		 if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)  {
			 result = 0;
		 }
		 
		 
		 	System.out.println(result);
	        return (int) result;
	 }
	 
	 
	 public static void main(String[] args) {
		Solution s = new Solution();
		s.reverse(123);
	}
}
