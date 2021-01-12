package com.generic;

public class FindMaxNumber {

	//public static void main(String[] args) {
		//Integer[] i1= {1,0,0};
        //int max= maxNumber(i1);
        //System.out.println("our maximum number is"+" "+max);
	//}
	public static<E extends Comparable<E>>int maxNumber(E[] number)
	{
	  E max=number[0];
		for(E num:number)
		{
			if(num.compareTo(max)>0)
				max=num;
		}
		System.out.println(max);
		return (int)max;
	}

}
