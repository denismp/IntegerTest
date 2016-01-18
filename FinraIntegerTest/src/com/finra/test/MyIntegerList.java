package com.finra.test;

import java.util.ArrayList;

/**
 * @author denisputnam
 *
 */
public class MyIntegerList
{	
	/**
	 * Print the given ArrayList.
	 * @param aList
	 */
	static public void printResult(ArrayList<Integer> aList)
	{
		for( int i = 0; i < aList.size(); i++ )
		{
			System.out.println( "list[" + i + "]=" + aList.get(i));
		}
	}

	/**
	 * Get the second largest integer in the given ArrayList Collection.
	 * @param aList
	 * @return value
	 */
	static public Integer getSecondLargest( ArrayList<Integer> aList )
	{
		Integer rVal = null;
		
		// Use a reverse bubble sort to sort the given ArrayList Collection.
		for( int j = aList.size() - 1; j > 0; j-- )
		{
			for( int i = 0; i < aList.size() - 1; i++ )
			{
				if( aList.get(i).intValue() < aList.get(i + 1).intValue() )
				{
					int first = aList.get(i).intValue();
					int second = aList.get( i + 1 ).intValue();
					aList.set(i, second);
					aList.set(i+1, first);
				}
			}
		}
		
		// Return the second item in the list.
		rVal = aList.get(1);
		return rVal;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> aList = new ArrayList<Integer>();

		aList.add(6);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(8);
		aList.add(1);
		aList.add(7);
		aList.add(5);
		aList.add(10);
		aList.add(9);
		
		Integer rVal = MyIntegerList.getSecondLargest(aList);
		MyIntegerList.printResult(aList);
		System.out.println("Second largest integer is " + rVal.intValue() );
	}

}
