
public class cogni_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "I love my country";
	       String[] str = input.split(" ");
	       StringBuilder ans = new StringBuilder();
	       
	       for(int i=0;i<str.length;i++)
	       {
	           StringBuilder temp = new StringBuilder(str[i]);
	           ans.append(temp.reverse() + " ");
	           //System.out.println(ans + " ");
	       }
	       
	       System.out.print(ans + " ");

	}

}
