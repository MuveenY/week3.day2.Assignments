package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		System.out.println("data lenth : " + length);
		
		List<Integer> list = new ArrayList<Integer> ();
		
		for (Integer a : data) {
			list.add(a);
		}
		
		Collections.sort(list);
		
		System.out.println("sorted list : " + list);
		
		int listSize = list.size();
		
		System.out.println("second largest no. in the list : " + list.get(listSize-2));
		
		
		

	}

}
