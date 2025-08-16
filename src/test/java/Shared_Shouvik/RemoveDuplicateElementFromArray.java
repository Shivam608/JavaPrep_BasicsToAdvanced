import java.util.Arrays;
import java.util.*;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
//		Arrays.sort(arr);
//		int[] temp = new int[arr.length];
//		int j = 0;
//		
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i] != arr[i+1])
//			{
//				
//					temp[j] = arr[i];
//					j++;
//			}
//		}
//		temp[j++]=arr[arr.length-1];
//		
//		
//		
//		for(int k=0; k<j;k++)
//		{
//			System.out.println(temp[k]);
//		}
		
		//Using HashSet
//		String str = "souviksouvik";
//		char[] ch = str.toCharArray();
//		HashSet<Character> set = new HashSet<>();
//		for(char c:ch)
//		{
//			set.add(c);
//		}
//		System.out.println(set);
		//System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));
		
		int[] arr = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
		
		Integer[] intArr = hs.toArray(new Integer[0]);
		int[] ans = new int[intArr.length];
		
		for(int i=0;i<ans.length;i++)
		{
			ans[i]=intArr[i];
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

}
