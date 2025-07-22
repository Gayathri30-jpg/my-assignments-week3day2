package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
	
	public static void main(String[] args) {
		List<String> Array = new ArrayList<String>();
Array.add("1");
Array.add("2");
Array.add("3");
Array.add("4");
Array.add("10");
Array.add("6");
Array.add("8");
		Collections.sort(Array);
		System.out.println("The list after sorted: " + Array);
		int nextElement = 0;
		int currentElement = 0;
		for(int i = currentElement+1; i!=nextElement; i++);
		
		{
		System.out.println("number with gaps detected" +Array);
		
		
		}
	}

}
