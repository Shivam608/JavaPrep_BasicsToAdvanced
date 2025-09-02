package Shared_Shouvik;

import java.util.*;

public class DuplicateCharacterRemoval {

	static String str = "PranayPranay";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedHashSet<Character> hs = new LinkedHashSet<>();
		
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
		}*/

//		System.out.println(Collections.singletonList(str));


		/// Type 1
		char[] c = str.toCharArray();
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < c.length; i++) {
			hashMap.put(String.valueOf(c[i]), i);
		}

		Set<Map.Entry<String, Integer>> mapSet = hashMap.entrySet();
		Iterator<Map.Entry<String, Integer>> it = mapSet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> it_map = it.next();
			System.out.print(it_map.getKey());
		}

		System.out.println();

		/// Type 2
		StringBuilder b = new StringBuilder();
		for (char c_ : str.toCharArray()) {
//			if (!String.valueOf(b).contains(String.valueOf(c_))) {
//				b.append(c_);
//			}

			if (String.valueOf(b).length()>1 && String.valueOf(b).contains("y")) break;
			b.append(c_);
		}

		System.out.println(b);

		/// Type 3
		LinkedList<String> linkedList = new LinkedList<>();
		for (char c1 : str.toCharArray()) {
			if (!linkedList.contains(String.valueOf(c1))) {
				linkedList.add(String.valueOf(c1));
			}
		}

		System.out.println(linkedList);
	}

}
