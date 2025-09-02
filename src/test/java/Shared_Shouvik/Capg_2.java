package Shared_Shouvik;

public class Capg_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input:
		//I love my country
		
		//Output:
		//I evol my country
		
		/*String input = "I love my country";
		String[] str = input.split(" ");
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].contains("love"))
			{
				StringBuilder temp = new StringBuilder(str[i]);
				ans.append(temp.reverse() + " ");
			}
			else
			{
				StringBuilder temp = new StringBuilder(str[i]);
				ans.append(temp+ " ");
			}
		}
		System.out.println(ans);*/

		int elementIndexToReverse = 0;
		String str = "I love my country";

		 int n = elementIndexToReverse + 1;

		 String elementToBeReversed = str.split(" ")[n];
		 StringBuilder b = new StringBuilder();
		for (int i = elementToBeReversed.length()-1; i >= 0; i--) {
			b.append(elementToBeReversed.charAt(i));
		}

		String reversedElement = String.valueOf(b);

		str = str.replace(elementToBeReversed, reversedElement);

		System.out.println(str);



	}

}
