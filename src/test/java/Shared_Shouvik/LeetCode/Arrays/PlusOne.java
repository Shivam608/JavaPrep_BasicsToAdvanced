package LeetCode.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3,9};
		int r=0;
		int[] ans = new int[digits.length+1];
		
		digits[digits.length-1] = digits[digits.length-1]+1;
		int lastDigit = digits[digits.length-1];
		
		if(digits[digits.length-1]>9)
		{
			
			for(int i=ans.length-1;i>=0;i--)
			{
				r=lastDigit%10;
				ans[i]=r;
				lastDigit=lastDigit/10;
				
			}
			
		}
		else
		{
			for(int i=0;i<ans.length-1;i++)
			{
				ans[i]= digits[i];
			//ans[ans.length-1]=lastDigit;
			}
		}
		
		for(int i=0;i<ans.length-1;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

}
