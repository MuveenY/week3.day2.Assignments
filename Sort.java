package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"Aspire systems", "Cts", "Wipro", "Hcl"};
		
		List<String> StrList = new ArrayList<String>(Arrays.asList(arr));
		
		int length = arr.length;
		System.out.println("length of array : " + length);
		
		Collections.sort(StrList);
		System.out.println("sorted array : " + StrList);
		
		Collections.reverse(StrList);
		System.out.println("reverse order  : "+ StrList);
		
		
			
		
		

	}

}
