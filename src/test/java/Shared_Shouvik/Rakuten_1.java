
public class Rakuten_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,8,9,3,10};
		int pair=12;
		
		for(int i=0;i<arr.length;i++) {
			int b=pair-arr[i];
			for(int j=0;j<arr.length;j++)
			{
				if(b==arr[j])
				{
					System.out.println("No found is " + arr[j]);
				}
			}
		}

	}

}
