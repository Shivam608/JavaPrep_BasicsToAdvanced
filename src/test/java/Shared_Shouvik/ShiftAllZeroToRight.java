
public class ShiftAllZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = { 1, 0, 2, 0, 3, 0, 0, 0 };
		int count=0;
		
		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i] != 0)
			{
				inputArr[count++] = inputArr[i];
			}
		}
		
		while(count < inputArr.length)
		{
			inputArr[count++] = 0;
		}
		
		for(int j=0;j<inputArr.length;j++)
		{
			System.out.print(inputArr[j] + " ");
		}

	}

}