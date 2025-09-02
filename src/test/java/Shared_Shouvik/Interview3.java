import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dad mom child dad";

		/*String[] str1 = str.split(" ");
		String ans = "";
		
		for(int i=0;i<str1.length;i++)
		{
			StringBuilder sb = new StringBuilder(str1[i]);
			//System.out.println(sb.reverse());
			
			String str2 = sb.reverse().toString();
			
			if(str1[i].contains(str2))
			{
				ans = ans+str1[i] + " ";
			}
			
		}

		System.out.println(ans);

		
		String[] ans1 = ans.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String s: ans1)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		
		for(String s: ans1)
		{
			if(map.get(s)>1)
			{
				System.out.println(s);
				break;
			}
		}

*/

		StringBuilder b = new StringBuilder();

		for (String s : str.split(" ")) {
			String s_ = String.valueOf(new StringBuilder(s).reverse());
			if(s_.equals(s)) {
				b.append(s_).append(" ");
			}
		}

		System.out.println(b);

		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String s : String.valueOf(b).split(" ")) {
			if (!hashMap.containsKey(s)) {
				hashMap.put(s, 1);
			} else {
				hashMap.put(s, hashMap.get(s)+1);
			}
		}

//		System.out.println(hashMap.size());

		for (String s : String.valueOf(b).split(" ")) {
			if (hashMap.containsKey(s)) {
				if (hashMap.get(s)>1) {
					System.out.println(s);
					break;
				}
			}
		}
	}

}
