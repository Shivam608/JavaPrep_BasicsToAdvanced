import java.util.Scanner;

public class kpmg_1 {
	static int numberOfRows;
	
	public static void print(int row)
	{
		
		for (int i = 1; i <= numberOfRows; i++) {
            // Determine the number of times to print the current number
        
            if(i%2!=0) {
                System.out.print(i);
                
                }
            for (int j = 1; j <= i; j++) {
               
                if(i%2==0) {
                System.out.print(i);
                }
                
            }
            System.out.println();
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        numberOfRows = scanner.nextInt();
        
		print(numberOfRows);

	}

}
