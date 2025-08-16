
public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "souvik";
		String s2= "das";
		
		String s= s1+s2;
		 s2=s.substring(0, s.length()-s2.length());
		 s1=s.substring(s2.length());
		 //s1=s.substring(s.length()-s1.length(), s.length());
		 System.out.println(s1);
		 System.out.println(s2);
		 //s2=s.substring(0, 0)

	}

}
