package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,1,14,18,16,17,19,18,17,20};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for (Integer value : arr) {
			
			if(!set.add(value))
				System.out.print("Duplicate values : " + value);
		}
		
	}

}
