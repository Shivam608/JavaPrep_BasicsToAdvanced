package LeetCode.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		int count =0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[count] = nums[i];
				count++;
			}
		}
		while(count<nums.length)
		{
			nums[count]= 0;
			count++;
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}

	}

}
