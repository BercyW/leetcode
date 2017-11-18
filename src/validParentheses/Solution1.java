package validParentheses;

import java.util.Stack;

public class Solution1 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if (stack.size() == 0)
					return false;
				char top = stack.pop();
				if (s.charAt(i) == ')') {
					if (top != '(')
						return false;

				} else if (s.charAt(i) == '}') {
					if (top != '{')
						return false;
				}else if(s.charAt(i)==']')
					if(top!='[') 
						return false;
			}
		}

		return stack.size()==0;
	}
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		System.out.println(s1.isValid("{{[]}"));

	}
}
