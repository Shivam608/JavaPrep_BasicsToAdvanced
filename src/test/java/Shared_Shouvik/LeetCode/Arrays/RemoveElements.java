package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		int val=3;
		int index=0;
//		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[index++]=nums[i];
			}
		}
		
		System.out.println(index);
		
//		System.out.println(ls.size());

	}

}
