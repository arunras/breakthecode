package string;

public class CountCharOccurenceWithoutLoop {

	public static void count(String str, CharSequence c) {
		int count = str.length() - str.replace(c, "").length();
		System.out.println("Number of " + c + " = " + count);
	}
}
