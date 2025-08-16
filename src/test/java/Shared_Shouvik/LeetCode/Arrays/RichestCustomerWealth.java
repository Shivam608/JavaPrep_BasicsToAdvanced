package LeetCode.Arrays;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = {{1,5},{7,3},{3,5}};
		
		int maxWealth = 0;
		for(int i=0;i<accounts.length;i++)
		{
			int wealth=0;
			for(int j=0;j<accounts[i].length;j++)
			{
				wealth=wealth+accounts[i][j];
				
			}
			maxWealth = Math.max(wealth, maxWealth);
		}
		System.out.println(maxWealth);

	}

}
