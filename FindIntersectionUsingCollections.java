package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int a : arr1) {
			list1.add(a);
		}
		for (int b : arr2) {
			list2.add(b);
		}
		
		System.out.println(list1);
        System.out.println(list2);
        
      list1.retainAll(list2);
      System.out.println("The Intersection values : " + list1);
        
	}

}
