package com.epam.lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;



public class LamdaHomeTask {
	public static void main(String[] args) {
		//=========================Task1=====================================//

		String sample="madam"; 
		System.out.println("Enter the String :"+sample); 
		Palindrome palindrome = (String str)->  new StringBuilder(str).reverse().toString().equalsIgnoreCase(sample);
		System.out.println(palindrome.checkPalindrome(sample)?"Given String is palindrome":"Given String is not a palindrome");

		//=============================Task2=================================//		

		List<Integer> numberList = new ArrayList<>();
		numberList.add(234);
		numberList.add(2345);
		numberList.add(9870);
		numberList.add(23345);
		SecondBiggestNumber secondBiggestNumber=(list)->{
			Collections.sort(list);
			return list.get(list.size()-2);
		};
		System.out.println("Second Largest Number in list :");
		System.out.println(secondBiggestNumber.findSecondBiggestNumber(numberList));

		//=========================Task3=====================================//		
		CheckTwoStringsAreRotations checkTwoStringsAreRotations=(a,b) ->{
			return CheckTwoStringsAreRotations.compute(a,b);
		};
		System.out.println(checkTwoStringsAreRotations.checkStringsAreRotations("Ravi", "vira"));
		//=========================Task4=======================//

		//		Runnable numbers=()->{for (int i=0;i<10;i++) System.out.print(i+" , "); System.out.println();};
		//		numbers.run();

		Thread thread =new Thread(()->{for (int i=0;i<10;i++) System.out.print(" , "+i); System.out.println();});
		thread.start();

		//==========================Task5===============================//

		SortReverseByComparator sortReverseByComparator= (list)->{
			list.sort((a,b)->(-1*Integer.compare(a, b)));
			return list;};
			System.out.println(sortReverseByComparator.sortReverseByComparator(numberList));

			//==========================Task6====================================//	

			List<String> employeeList = new ArrayList<>();
			employeeList.add("ARUN");
			employeeList.add("ajay");
			employeeList.add("arun");
			employeeList.add("varun");

			SortEmployeeReverseByComparator sortEmployeeReverseByComparator= (list)->{
				list.sort(String::compareToIgnoreCase);
				return list;
			};

			System.out.println(sortEmployeeReverseByComparator.sortEmployeeReverseByComparator(employeeList));

			//========================Task7========================//

			TreeSet<Integer> numberSet = new TreeSet<>((a,b)->-1*Integer.compare(a, b));
			numberSet.add(12);
			numberSet.add(212);
			numberSet.add(152);
			numberSet.add(132);
			System.out.println(numberSet);

			//========================Task8=========================/

			TreeSet<String> employeeSet = new TreeSet<>();
			employeeSet.add("Arun");
			employeeSet.add("abul");
			employeeSet.add("kamal");
			employeeSet.add("varun");

			System.out.println(employeeSet);

			//==========================Task9========================//

			TreeMap<Integer, Integer> numberMap = new TreeMap<>();
			numberMap.put(101, 11);
			numberMap.put(102, 10);
			numberMap.put(103, 9);
			numberMap.put(104, 2);
			numberMap.put(105, 5);

			Map<Integer, Integer> numberSortedMap = SortMapByValues(numberMap);
			System.out.println(numberSortedMap);

			//==========================Task10============================//
			TreeMap<Integer, String> employeeMap = new TreeMap<>();
			employeeMap.put(101, "Ajay");
			employeeMap.put(102, "Karan");
			employeeMap.put(103, "karan");
			employeeMap.put(104, "david");
			employeeMap.put(105, "Balu");

			Map<Integer,String> employeeSortedMap= SortEmployeeMapByValues(employeeMap);

			System.out.println(employeeSortedMap);

			//===========================Task11==============================//


			Collections.sort(employeeList,(o1,o2)->(-1*o1.compareTo(o2)));
			System.out.println(employeeList);


	}

	private static Map<Integer,String> SortEmployeeMapByValues(TreeMap<Integer, String> employeeMap) {

		List<Entry<Integer,String>> entrySet = new ArrayList<Entry<Integer,String>>(employeeMap.entrySet());
		SortEmployeeMapByValues sortMapByValues = (o1,o2)-> -1*o1.getValue().compareTo(o2.getValue());
		Collections.sort(entrySet,sortMapByValues);
		Map<Integer, String> tempMap = new LinkedHashMap<Integer,String>();
		for(Entry<Integer, String> entry:entrySet)
		{
			tempMap.put(entry.getKey(), entry.getValue());
		}

		return tempMap;
	}


	private static <K,V extends Object> Map<K,V> SortMapByValues(TreeMap<K,V> map) {

		List<Entry<K,V>> entrySet = new ArrayList<>(map.entrySet());
		SortMapByValues<K,V> sortMapByValues =(o1,o2)->-1*Double.compare(Double.parseDouble(o1.getValue().toString()), 
				Double.parseDouble(o2.getValue().toString()));




		Collections.sort(entrySet,sortMapByValues);
		Map<K,V> tempMap = new LinkedHashMap<K,V>();
		for(Entry<K, V> entry:entrySet)
		{
			tempMap.put(entry.getKey(), entry.getValue());
		}

		return tempMap;
	}

}
