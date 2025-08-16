
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String str = "Souvik"; char[] ch = str.toCharArray();
		 * 
		 * for(int i=ch.length-1; i>=0; i--) { System.out.println(ch[i]); }
		 */
		
		
		/*
		 * String str="souvik";
		 * 
		 * String rev="";
		 * 
		 * for(int i=str.length()-1;i>=0;i--) {
		 * 
		 * char ch=str.charAt(i); rev+=ch;
		 * 
		 * 
		 * } System.out.println(rev);
		 */
	
		
		
		String str="my name is souvik , i am an automation engineer .";
		String str2[]=str.split(" ");//converting string to array
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+" ");
			//System.out.println(" ");
			
		}
		StringBuilder ans=new StringBuilder(); // StringBuffer can also be used with same implementation
		//1. StringBuilder-mutable(thread not safe,fast)   2.StringBuffer-mutable(it is thread safe)   3.String-immutable(cannot be changed, more memory consuming)
		System.out.println(" ");
		for(int i=str2.length-1;i>=0;i--) {
			StringBuilder temp=new StringBuilder(str2[i]);
			//ans.append(temp.reverse());//it will reverse both wordss as well as characters
			ans.append(temp);//if u want to reverse the words but not the characters
			ans.append(" ");
		}
		System.out.println("The Reversed String is - "+ans);
		
		
		
		
		
		
	}
	
}


