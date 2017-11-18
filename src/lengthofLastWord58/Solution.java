package lengthofLastWord58;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.lengthOfLastWord("fdf afff  "));
	}
	public int lengthOfLastWord(String s) {
		if(s.length()==0 || s == null) return 0;
		
		int count = 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)!=' ') {
				count++;
			}else if(s.charAt(i)==' ' && count!= 0) {
				return count;
			}
		}
		return count;
	}
}
