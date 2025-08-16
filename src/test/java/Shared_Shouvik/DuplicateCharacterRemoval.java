import java.util.LinkedHashSet;

public class DuplicateCharacterRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "souviksouvik";
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		System.out.println(hs);
		
		Character[] chArr = hs.toArray(new Character[0]);
		char[] ch = new char[chArr.length];
		for(int i=0;i<chArr.length;i++)
		{
			ch[i]=chArr[i];
		}
		
		for(int i=0;i<chArr.length;i++)
		{
			System.out.print(ch[i]+" ");
		}

	}

}
