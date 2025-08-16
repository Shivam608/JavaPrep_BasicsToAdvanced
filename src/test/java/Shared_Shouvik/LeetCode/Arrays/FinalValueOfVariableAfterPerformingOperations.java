package LeetCode.Arrays;

public class FinalValueOfVariableAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = {"++X","++X","X++"};
		int X = 0;
		for(int i=0;i<operations.length;i++)
		{
			if(operations[i].contains("X++") || operations[i].contains("++X"))
			{
				X++;
			}
			if(operations[i].contains("X--") || operations[i].contains("--X"))
			{
				X--;
			}
//			else
//			{
//				break;
//			}
		}
		System.out.println(X);

	}

}
