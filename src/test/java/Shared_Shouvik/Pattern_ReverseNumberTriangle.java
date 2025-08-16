
public class Pattern_ReverseNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int count =1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k + " ");
				count++;
			}
			count=2;
			System.out.println();
		}

	}

}
