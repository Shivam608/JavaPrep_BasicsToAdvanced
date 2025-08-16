
public class Capg_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input:
		//I love my country
		
		//Output:
		//I evol my country
		
		String input = "I love my country";
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
		System.out.println(ans);
		
		

	}

}
