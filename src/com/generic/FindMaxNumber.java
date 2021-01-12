package com.generic;

public class FindMaxNumber {
	public static<E extends Comparable<E>>String maxNumber(E[] number)
	{
	  E max=number[0];
		for(E num:number)
		{
			if(num.compareTo(max)>0)
				max=num;
		}
		System.out.println(max);
		return (String)max;
	}

}
