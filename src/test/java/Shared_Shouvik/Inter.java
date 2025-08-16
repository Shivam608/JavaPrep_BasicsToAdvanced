import java.util.*;
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "testing";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c:ch)
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
		
		for(char c:ch)
		{
			if(map.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		}
		

	}

}
