import java.util.HashMap;

public class firstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Geeks For Geeks";
		String[] ch = str.split(" ");
		//char[] ch = str.toCharArray();
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String c:ch)
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
		System.out.println(map);
		
		for(String c:ch)
		{
			if(map.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		}
		

	}

}
