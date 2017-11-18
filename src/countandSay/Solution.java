package countandSay;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		for (int i = 1; i <= 7; i++) {
			System.out.println(s.countAndSay(i));
		}
	}
	
	
	 public String countAndSay(int n) {
		 if(n<=0)
			          return "";
			      String curRes = "1";
			      int start = 1;//从1开始算
			      while(start < n){
			          StringBuilder res = new StringBuilder();
			          int count = 1;
			          for(int j=1;j<curRes.length();j++){
			             if(curRes.charAt(j)==curRes.charAt(j-1))
			                 count++;
			             else{
			                 res.append(count);
			                 res.append(curRes.charAt(j-1));
			                 count = 1;
			             }
			         }
			         res.append(count);
			         res.append(curRes.charAt(curRes.length()-1));
			         curRes = res.toString();
			         start++;
			     }
			     return curRes;
	    }
}
