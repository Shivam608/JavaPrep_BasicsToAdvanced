package LeetCode.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
		int major = nums.length/2;
		int majorEle=0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num:nums) {
			if(map.containsKey(num)) {
				map.put(num, map.getOrDefault(num,0)+1);
			}
			else
				map.put(num, 1);
		}
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		for(int num:nums) {
			if(map.get(num)>major) {
				majorEle = num;
				
			}
		}
		System.out.println("Major element is: " + majorEle);
		

	}

}
