
public class Pattern_PalindromeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l+" ");
			}
			
			System.out.println();
		}

	}

}
