import java.util.Scanner;

public class ThatIsPerfection {

	///  Check weather devisors of an Integer when added is equals to the original number
	/// Example devisors of 6 ->1, 2, 3 sum = 6  YES
	/// 28 -> 1, 2, 4, 7, 14  sum = 28 YES
	/// 12 -> 1,2,3,4,6 sum = 16 NO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int i=1;

		int s=0;
		while(i<n)
		{
			int r=n%i;
			if(r==0)
			{
				s=s+i;
			}
			i++;
		}
		if(s==n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }

	}

}
