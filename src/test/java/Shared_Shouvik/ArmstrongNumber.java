
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 371;
		int r=0;
		double s=0;
		
		while(num!=0)
		{
			r=num%10;
			s=s + Math.pow(r, 3);
			num=num/10;
		}
		
		System.out.println(s);

	}

}
