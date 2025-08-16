
public class SumOfDigitsOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int r=0;
		int s=0;
		
		while(num!=0)
		{
			r=num%10;
			s=s+r;
			num=num/10;
		}
		
		System.out.println(s);

	}

}
