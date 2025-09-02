package Shared_Shouvik;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/// ArmstrongNumber =  that is equal to the sum of its own digits each raised to the power of the number of digits
		int num = 371;
//		int r=0;
//		double s=0;
//
//		while(num!=0)
//		{
//			r=num%10;
//			s=s + Math.pow(r, 3);
//			num=num/10;
//		}
//
//		System.out.println(s);

		char[] c = String.valueOf(num).toCharArray();
		int i = 0;
		for (char c_ : c) {
			i += (int) Math.pow(Character.getNumericValue(c_),c.length);
		}

		System.out.println(i);

	}

}
