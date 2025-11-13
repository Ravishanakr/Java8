package com.demo;

import java.util.Arrays;
import java.util.List;

public class ForEachOrderd {

	public static void main(String[] args) {
		
		
	List<Integer> asList = Arrays.asList(2,31,321,12,45,1,54,2);
	
	asList.parallelStream().forEach(p->System.out.print(p));
	
	// out put :14525432112231
	
	System.out.println();
	
	asList.parallelStream().forEachOrdered(p->System.out.print(p));

	// out put :23132112451542

	

	}

}
