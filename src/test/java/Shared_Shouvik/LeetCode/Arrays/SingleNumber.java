package LeetCode.Arrays;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1};
		int n=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i: nums)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		for(int i: nums)
		{
			if(map.get(i)==1)
			{
				n=i;
				
			}
		}
		System.out.println(n);

	}

}
