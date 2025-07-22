package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class FindIntersection {

	public static void main(String[] args) 
	{
		Integer[] arr1 = {3,2,11,4,6,7};
		Integer[] arr2 = {1,2,8,4,9,7};
		List<Integer> arr1l = new ArrayList ( Arrays.asList(arr1));
        List<Integer> arr2l = new ArrayList (Arrays.asList(arr2));
		for(int i = 0; i< arr2.length; i++)
			{
			System.out.println(arr1[i]);	
			if(arr1.equals(arr2l))
			{
				System.out.println(arr2[i]);
				
			}
			}}
	}

	