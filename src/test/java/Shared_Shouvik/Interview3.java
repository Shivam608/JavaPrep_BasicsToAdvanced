import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dad mom child dad";
		String[] str1 = str.split(" ");
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


	}

}
