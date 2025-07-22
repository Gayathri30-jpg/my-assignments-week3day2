package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestNumber {

	public static void main(String[] args) {
		List<String> largestnum = new ArrayList<String>();
  largestnum.add("3");
  largestnum.add("2");
  largestnum.add("11");
  largestnum.add("4");
  largestnum.add("6");
  largestnum.add("7");
  String valueAtIndex1 = largestnum.get(1);
  Collections.sort(largestnum);
  System.out.println("The list after sorted: " +largestnum);
}

}
