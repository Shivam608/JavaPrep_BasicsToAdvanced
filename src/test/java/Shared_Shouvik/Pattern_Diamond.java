
public class Pattern_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		int m=4;
		for(int i=m;i>=1;i--)
		{
			for(int j=m-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
