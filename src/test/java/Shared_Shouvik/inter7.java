import java.util.*;
public class inter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Souvik";
		String s2 = s.replaceAll(" ", "");
		String str = s2.toLowerCase();
		char[] ch = str.toCharArray();
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
