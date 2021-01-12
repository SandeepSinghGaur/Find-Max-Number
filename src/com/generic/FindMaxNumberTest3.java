package com.generic;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class FindMaxNumberTest3 {
	@Test
	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		boolean result;
		Integer[] i1 = new Integer[3];
		for (int i = 0; i < i1.length; i++) {
			i1[i] = sc.nextInt();
		}
		int max = FindMaxNumber.maxNumber(i1);
		if (max == i1[2])
			result = true;
		else
			result = false;

		assertEquals(true, result);
		sc.close();
	}

}
