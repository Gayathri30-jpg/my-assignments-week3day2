package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReserveString {

	public static void main(String[] args) {

	List<String> Array = new ArrayList<String>();
	Array.add("HCL");
	Array.add("Wipro");
	Array.add("Aspire Systems");
	Array.add("CTS");
	System.out.println("the list before sorting:" + Array);
	Collections.sort(Array, Collections.reverseOrder());
	System.out.println("The list after sorted: " + Array);
	
	}
	}
	

