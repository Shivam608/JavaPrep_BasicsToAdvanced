
public class Print1to100WithoutUsingLoop {
	
	public static void printNum(int num)
	{
		if(num<=10)
		{
			System.out.print(num + " ");
			printNum(num+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum(1);
	}


}
