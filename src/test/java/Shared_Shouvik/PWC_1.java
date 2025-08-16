import java.util.Arrays;

public class PWC_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,10,4,5,11,12,13};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int largestMissing = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] - arr[i - 1] > 1) {
            	largestMissing = arr[i] - 1;
                break;
            }
        }
        
        if (largestMissing == -1 && arr[0] != 1) {
            largestMissing = arr[0] - 1;
        }
        
        if (largestMissing != -1) {
            System.out.println("The largest missing number is: " + largestMissing);
        } else {
            System.out.println("There is no missing number in the array.");
        }

	}

}
