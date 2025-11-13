package com.demo.groupBySummerzing;


import java.util.*;
import java.util.stream.*;

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(2, 43, 32, 12, 32);

		IntSummaryStatistics num = asList.stream().collect(Collectors.summarizingInt(p -> p));

		System.out.println(num);

	}
}
