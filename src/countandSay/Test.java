package countandSay;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
	
		System.out.println(4%20);
		System.out.println(t.hammingDistance(20, 40));
	}
	 public int hammingDistance(int x, int y) {
		 
		 int count = 0;
		 String a = Integer.toBinaryString(x);
		 String b = Integer.toBinaryString(y);
		 /*
		 StringBuilder sb = new StringBuilder();
		 if(a.length()<4) {
			 sb.append("000");
			 sb.append(a);
		 }
		
		
			for (int i = 0; i < b.length(); i++) {
				if(a.charAt(i) == a.charAt(i)) 
					continue;
				if(a.charAt(i)!=a.charAt(i)) {
					count++;
				}
			}
	*/
		 System.out.println(a+"-----"+b);
		 return count;
	 }
}
