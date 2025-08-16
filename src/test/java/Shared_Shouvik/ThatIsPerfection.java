import java.util.Scanner;

public class ThatIsPerfection {

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
