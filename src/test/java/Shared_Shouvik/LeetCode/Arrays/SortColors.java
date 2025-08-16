package LeetCode.Arrays;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		int zero = 0;
		int one =0;
		int two =0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			{
				zero++;
			}
			if(nums[i]==1)
			{
				one++;
			}
			if(nums[i]==2)
			{
				two++;
			}
		}
		
        int index = 0;

        for (int i = 0; i < zero; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < one; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < two; i++) {
            nums[index++] = 2;
        }

		 
		 for(int i=0;i<nums.length;i++)
		 {
			 System.out.print(nums[i]+" ");
		 }

	}

}
