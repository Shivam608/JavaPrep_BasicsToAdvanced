
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		boolean isPrime;
		
		if(num<0)
		{
			isPrime=false;
			System.out.println("Not Prime");
		}
		
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					//break;
					//System.out.println("Not Prime");
				}
				
				else
				{
					isPrime=true;
					
				}
				
			}
			if(isPrime=true)
			{
				System.out.println("Prime Number");
			}
				
				//System.out.println("Prime Number");
		}
		
	
//		else
//		{
//			System.out.println("Not Prime Number");
//		}

	}

}
