package LeetCode.Arrays;

import java.util.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,6,7,8,10};
		Arrays.sort(nums);
		int target = 5;
		int index=-1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				index=i;
				System.out.println(index);
				
			}
			else if(nums[i]+1==target)
			{
				index=i+1;
				System.out.println(index);
				
			}
			else if(nums[i]-1==target)
			{
				index=i+1;
				System.out.println(index);
				
			}
			else if(target==0)
			{
				index=0;
				System.out.println(index);
				break;
			}
		}

	}

}
