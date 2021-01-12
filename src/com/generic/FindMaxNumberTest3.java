package com.generic;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class FindMaxNumberTest3 {
	@Test
	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		boolean result;
		String[] name = new String[3];
		for (int i = 0; i < name.length; i++) {
			String insertName = sc.nextLine();
			name[i] = insertName.toUpperCase();
		}
		String max = FindMaxNumber.maxNumber(name);
		if (max == name[2])
			result = true;
		else
			result = false;

		assertEquals(true, result);
		sc.close();
	}

}
