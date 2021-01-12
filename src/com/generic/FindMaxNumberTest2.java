package com.generic;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class FindMaxNumberTest2 {
	@Test
	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		boolean result;
		Float[] i1 = new Float[3];
		for (int i = 0; i < i1.length; i++) {
			i1[i] = sc.nextFloat();
		}
		float max = FindMaxNumber.maxNumber(i1);
		if (max == i1[1])
			result = true;
		else
			result = false;

		assertEquals(true, result);
		sc.close();
	}

}