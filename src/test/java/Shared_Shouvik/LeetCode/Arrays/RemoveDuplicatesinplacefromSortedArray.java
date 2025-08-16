package LeetCode.Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesinplacefromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			hs.add(nums[i]);
		}

        Integer[] integerArray = hs.toArray(new Integer[0]);

        int[] intArray = new int[integerArray.length];
        
        for (int i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }
        
        for (int i = 0; i < integerArray.length; i++)
        {
        	System.out.print(intArray[i]+" ");
        }

	}

}
