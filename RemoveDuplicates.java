package week3.day2.Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "PayPal India";
		String str1 = str.toLowerCase();
		String str2 = str1.replaceAll("\\s", "");
		// System.out.println(str2);

		char[] arr = str2.toCharArray();
		System.out.println(arr);

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (char c : arr) {
			boolean unique = charSet.add(c);
			if (unique == false)
				dupCharSet.add(c);

		}

		System.out.println("unique chars : " + charSet);
		System.out.println("duplicate chars : " + dupCharSet);

	}

}
