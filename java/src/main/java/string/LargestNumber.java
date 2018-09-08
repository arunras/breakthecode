package string;

public class LargestNumber {

	public static int getLLessThanN(int number, int digit) {
		// converting digit to char
		char c = Integer.toString(digit).charAt(0);
		
		// Decrementing number and check whether it contains digit
		int indexC;
		for (int i = number; i > 0; i--) {
			indexC = Integer.toString(i).indexOf(c);
			//System.out.println(indexC);
			if (indexC == -1) {
				return i;
			}
		}
		return -1;
	}
}
