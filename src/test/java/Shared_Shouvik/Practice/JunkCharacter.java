package Practice;

public class JunkCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {
//		String str="efdrftgh5677ASDSd#$%^V%&&#@@4567abcd";
//		char[] ch = str.toCharArray();
//		//remove junk characters
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>= 'a'  && ch[i]<= 'z'||ch[i]>= 'A'  && ch[i]<= 'Z'||ch[i]>='0'&& ch[i]<='9')
//			{
//				System.out.print(ch[i]);
//			}
//		}
		
		String str="efdrftgh5677d#$%^V%&&#@@4567abcd";
		String ans="";
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
			ans+=ch;	
			}
			}
		System.out.println(ans);
	

	}

}
