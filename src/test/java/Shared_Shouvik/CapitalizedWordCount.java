package Shared_Shouvik;

public class CapitalizedWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String input = "SATya";
		/*int count =0;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>='A' && input.charAt(i)<='Z')
			{
				count++;
			}
		}
		
		System.out.println(count);*/

		char cap = 'A';
		int capCount = 0;


		for (int i = 0; i <= 26; i++) {
			if (input.contains(String.valueOf((char) (cap + i)))) {
				capCount++;
			}
		}

		System.out.println("Cap Count: " + capCount);
	}

}
