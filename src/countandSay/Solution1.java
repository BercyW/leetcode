package countandSay;

public class Solution1 {
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		// for (int i = 1; i <= 7; i++) {
		System.out.println(s1.countAndSay(3));
		// }
	}

	public String countAndSay(int n) {
		if(n<=0) return "";
		
		String start ="1";
		int i = 1;
		
		while(i<n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < start.length(); j++) {
				if(start.charAt(j)==start.charAt(j-1)) {
					count++;
				}else {
					sb.append(count);
					sb.append(start.charAt(j-1));
					count=1;
				}
			}
			
			sb.append(count);
			sb.append(start.charAt(start.length()-1));
			start = sb.toString();
			i++;
		
		
		}
		return start;
	}
}
