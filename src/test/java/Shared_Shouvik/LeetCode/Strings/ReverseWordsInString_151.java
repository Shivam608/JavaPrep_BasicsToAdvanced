package LeetCode.Strings;

public class ReverseWordsInString_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a good   example";
		String[] ch = s.split(" ");
	      //char[] ch = s.toCharArray();
	       String n ="";
	       for(int i=ch.length-1;i>=0;i--)
	       {
	            n = n + ch[i] + " ";
	       }
	       
//	        n.trim().replaceAll("\\s+", " ");
	        System.out.println(n.trim().replaceAll("\\s+", " "));

	}

}
