import java.util.*;


public class EachCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "aasshhhfdsfg";
		int num = 454852466;
		
		//Important
		String input =Integer.toString(num);
		
		
		char[] ch = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c:ch)
		{
			if(c%2==0)
			{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			}
		}
		
		System.out.println(map);
		
		Set<Character> key = map.keySet();
//		System.out.println(key);
		
		for(char c:key)
		{
		if(map.get(c)>1)
		{
			System.out.println(c + "=" + map.get(c));
		}
//		else
//		{
//			System.out.println(c + "=" + map.get(c));
//		}
		}
		

	}

}
