import java.util.*;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str = "a2b3c4";
		String str = "2a3b4c";

		for (int i = 1; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				for (int j = 1; j < Character.getNumericValue(c); j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}


