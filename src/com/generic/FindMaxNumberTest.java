package com.generic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

public class FindMaxNumberTest {
	@Test
	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		boolean result;
		ArrayList<Integer> name1 = new ArrayList<Integer>();
		ArrayList<Double> name2 = new ArrayList<Double>();
		ArrayList<String> name3 = new ArrayList<String>();
		int value = (int) ((Math.random() * 10) % 3) + 1;
		switch (value) {
		case 1:
			System.out.println("Please insert Only Integer Value!");
			for (int i = 0; i < 3; i++)
			{
				int number = sc.nextInt();
				name1.add(number);
			}
			Comparable<?> max = FindMaxNumber.maxNumber(name1);
			if (max == name1.get(0))
				result = true;
			else
				result = false;
			assertEquals(true, result);
			break;
		case 2:
			System.out.println("Please insert only Double Value!");
			for (int i = 0; i < 3; i++) 
			{
				Double number = sc.nextDouble();
				name2.add(number);
			}
			Comparable<?> max1 = FindMaxNumber.maxNumber(name2);
			if (max1 == name2.get(0))
				result = true;
			else
				result = false;
			assertEquals(true, result);
			break;
		case 3:
			System.out.println("Please insert only String!");
			for (int i = 0; i < 3; i++) 
			{
				String number1 = sc.nextLine();
				String number = number1.toUpperCase();
				name3.add(number);
			}
			Comparable<?> max11 = FindMaxNumber.maxNumber(name3);
			if (max11 == name3.get(0))
				result = true;
			else
				result = false;
			assertEquals(true, result);
			break;
		default:
			System.out.println("Something happened Wrong! So please Check the Code");
		}
		sc.close();
	}
}
