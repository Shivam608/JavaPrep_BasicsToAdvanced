import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,58,45,89,65,75,21,23,88};
		int num=58;
		int index = -1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				index=i;
				break;
				
			}
			else
			{
				index = -1;
			}
		}
		
		if(index==-1)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println("Number found at : " + index + "index");
		}

	}

}
