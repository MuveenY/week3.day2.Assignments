package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);

		List<Integer> list = new ArrayList<Integer>();

		for (Integer a : arr) {
			list.add(a);
		}
		for (int i = 1; i <= list.size(); i++) {

			if (list.get(i) != i + 1) {
				System.out.println("Missing element : " + i + 1);
				break;
			}

		}

	}

}
