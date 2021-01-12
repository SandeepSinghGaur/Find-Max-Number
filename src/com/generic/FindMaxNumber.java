package com.generic;

import java.util.ArrayList;

public class FindMaxNumber {
	public static<E extends Comparable<E>> E maxNumber(ArrayList<?> number)
	{
	  E max=(E) number.get(0);
		for(Object num:number)
		{
			if(((Comparable<E>) num).compareTo(max)>0)
				max=(E) num;
		}
		System.out.println(max);
		return max;
	}

}
