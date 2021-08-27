package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingCollections {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		 String text1 = text.toLowerCase();
	     
		String[] words = text1.split(" ");
		
		Set<String> uniqueWords = new LinkedHashSet<String>();
		
		for (String eachWord : words) {
			uniqueWords.add(eachWord);
		}
		
		for (String string : uniqueWords) {
			System.out.print(string + " ");
			
		}
			

		
		
		
	}

}
