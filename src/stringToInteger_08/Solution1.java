package stringToInteger_08;

public class Solution1 {
	public int myAtoi(String str) {
		 if (str == null || str.length() < 1)
		        return 0;
		 
		    // trim white spaces at beginning and end
		    str = str.trim();
		 
		    char flag = '+';
		 
		    // check negative or positive
		    int i = 0;
		    if (str.charAt(0) == '-') {
		        flag = '-';
		        i++;
		    } else if (str.charAt(0) == '+') {
		        i++;
		    }
		    // use double to store result
		    int result = 0;
		 
		    // calculate value
		    while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		        if(Integer.MAX_VALUE/10 < result || (Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < (str.charAt(i) - '0'))) 
		            return flag == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		            
		        result = result * 10 + (str.charAt(i) - '0');
		        i++;
		    }
		 
		    if (flag == '-')
		        result = -result;
		 
		    return result;

	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.myAtoi("-12a"));
	}
}
