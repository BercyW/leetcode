package longestCommonPrefix;

public class Test {
	
	
	public static void main(String[] args) {
		Test s = new Test();
		String[] str = {"adf"};
		System.out.println(s.longestCommonPrefix(str));
	}
		   public String longestCommonPrefix(String[] strs) {
		        int prefix = 0;
		        boolean keepgoing = true;
		        if(strs.length == 0) return new String("");
		        if(strs.length == 1) return strs[0];
		        if(strs[0].length() == 0) return new String("");
		        while(keepgoing){
		            for(int i = 1; i < strs.length; i++){
		                if(strs[i].length() == 0) return new String("");
		                if(prefix >= strs[i].length() || prefix >= strs[0].length()){
		                    keepgoing = false;
		                    break;
		                }
		                char pre = strs[i-1].charAt(prefix);
		                char cur = strs[i].charAt(prefix);
		                if(pre != cur){
		                    keepgoing = false;
		                    break;
		                }
		            }
		            if(keepgoing){
		                prefix++;
		            }
		        }
		        return strs[0].substring(0,prefix);
		    }
		}
