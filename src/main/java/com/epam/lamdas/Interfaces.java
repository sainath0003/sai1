package com.epam.lamdas;


import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class Interfaces {

}

interface Palindrome{
boolean checkPalindrome(String str);
}

interface SecondBiggestNumber {
	int findSecondBiggestNumber(List<Integer> list);
	
}

interface CheckTwoStringsAreRotations{
	boolean checkStringsAreRotations(String str1,String str2);
	 static boolean compute(String str1,String str2)
	{
		int index=str2.toLowerCase().indexOf(str1.toLowerCase().charAt(0))%str2.length();
		if(index==-1)return false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.toLowerCase().charAt(i)==str2.toLowerCase().charAt(index))
			{
				index++;
				index=index%str2.length();
			}
			else
				return false;
		}
		return true;
	}
}

interface SortReverseByComparator {
	List<Integer> sortReverseByComparator(List<Integer> list);
}

interface SortEmployeeReverseByComparator {
	List<String> sortEmployeeReverseByComparator(List<String> list);
}

interface PrintNumbersUsingRunnable extends Runnable{
	
}

interface SortEmployeeMapByValues extends Comparator<Entry<Integer,String>>{

	
}


interface SortMapByValues<K,V extends Object > extends Comparator<Entry<K,V>>{
	

	
}






