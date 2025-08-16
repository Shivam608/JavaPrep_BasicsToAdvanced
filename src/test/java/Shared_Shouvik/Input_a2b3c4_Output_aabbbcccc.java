
public class Input_a2b3c4_Output_aabbbcccc {

//	static void convertNumToChar(String s) {
//
//		for(int i =0; i < s.length(); i++) {
//		if(Character.isAlphabetic(s.charAt(i))){
//		System.out.print(s.charAt(i));
//		}else {
//		int a = Character.getNumericValue(s.charAt(i));
//		for(int j =1; j <a; j++) {
//		System.out.print(s.charAt(i-1));
//		}
//		}
//		}
//
//		}

		public static void main(String[] args) {

//		String str = "a2b3c4"; //output = aabbbcccc
//		
//		for(int i=0;i<str.length();i++)
//		{
//			if(Character.isAlphabetic(str.charAt(i)))
//			{
//				//System.out.println(str.charAt(i));
//			}
//			else
//			{
//				int a = Character.getNumericValue(str.charAt(i));
//				for(int j=0;j<a;j++)
//				{
//					System.out.print(str.charAt(i-1));
//				}
//			}
//		}

			
			
//			String str="a2b3c4";
//			for(int i=0;i<str.length();i++) {
//				char ch=str.charAt(i);//a,2
//				if(Character.isAlphabetic(ch)) {
//					
//				}
//				else {
//					int a=Character.getNumericValue(ch);
//					for(int j=0;j<a;j++) {   //2
//						System.out.print(str.charAt(i-1));
//					}
//				}
//			}
			
			
			String str = "a2b3c4";
			for(int i=0;i<str.length();i++)
			{
				if(Character.isAlphabetic(str.charAt(i)))
				{
					System.out.print(str.charAt(i));
					
				}
				
				else
				{
					int a = Character.getNumericValue(str.charAt(i));
					for(int j=1;j<a;j++)
					{
						System.out.print(str.charAt(i-1));
					}
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
