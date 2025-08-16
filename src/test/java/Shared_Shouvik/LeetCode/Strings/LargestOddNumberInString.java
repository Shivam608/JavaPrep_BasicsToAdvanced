package LeetCode.Strings;

public class LargestOddNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="52";
		String output="";
		if((Integer.parseInt(num))%2!=0)
		{
			output=output+Integer.parseInt(num);
		}
		
		else 
		{
		for(int i=0;i<num.length();i++)
		{
			int n = Character.getNumericValue(num.charAt(i));
			if(n%2!=0 || num.charAt(i)==0)
			{
				output=output+num.charAt(i);
			}
		}
		
		}
		System.out.println(output);

	}

}
