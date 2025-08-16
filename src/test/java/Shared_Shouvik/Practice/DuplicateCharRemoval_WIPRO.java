package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharRemoval_WIPRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "souviksouvik"; //print only the unique char
//		char[] ch=str.toCharArray();
//		
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//		for(char c: ch)
//		{
//			if(map.containsKey(c))
//			{
//				map.put(c, map.get(c)+1);
//			}
//			else
//			{
//				map.put(c, 1);
//			}
//		}
//		
//		Set<Character> keys = map.keySet();
//		for(char c: keys)
//		{
//			if(map.containsKey(c))
//			{
//				map.put(c, 1);
//			}
//			else
//			{
//				break;
//			}
//		}
//		
//		System.out.println(map);
		
		
		
// Lekha
		
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			//if(Character.isAlphabetic(ch)) {
				hs.add(ch);
			//}
		}
System.out.println(hs);
	}
}
