
public class LongestConsecutiveOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 3, 25, 6, 7, 8, 9, 2, 6, 10 };
		int count= 1;
		int ans = -1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1==arr[i+1])
			{
				count++;
				ans = Math.max(count, ans);
			}
			else {
				count = 1;
			}
		}
		
		System.out.println(ans);

	}

}
