import java.util.Scanner;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		import java.io.BufferedReader;
//		import java.io.InputStreamReader;
//		import java.util.*;
		class TestClass {
		    public static void main(String args[] ) throws Exception {
		        //BufferedReader
		        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        // String name = br.readLine();                // Reading input from STDIN
		        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		        //int n = 5;
		        Scanner sc = new Scanner(System.in);
		        int T = sc.nextInt();
		        int n=0;
		        int[] arr = new int[T];
		        for(int i=0;i<T;i++) {

		            n = sc.nextInt();
		            arr[i]=n;

		        }
		        
				int y=1;

				int s=0;
		        for(int i=0;i<arr.length;i++)
		        {
		            int r=arr[i]%y;
		            if(r==0)
		            {
		                s=s+y;
		            }
		            y++;
		        }
				// while(i<n)
				// {
				// 	int r=n%i;
				// 	if(r==0)
				// 	{
				// 		s=s+i;
				// 	}
				// 	i++;
				// }
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


	}

}
