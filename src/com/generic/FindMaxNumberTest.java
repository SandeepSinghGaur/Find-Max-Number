package com.generic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.generic.FindMaxNumber.MaximumNumber;

public class FindMaxNumberTest {
	@Test
	public void findMaxNumber() {
		boolean result;
		Integer int1 = 3, int2 = 4, int3 = 5;
		Float float1 = 3.3f, float2 = 4.4f, float3 = 5.5f;
		String string1 = "banana", string2 = "apple", string3 = "pear";
		Integer result1 = (Integer) new MaximumNumber(int1, int2, int3).maximum();
		Float result2 = (Float) new MaximumNumber(float1, float2, float3).maximum();
		String result3 = (String) new MaximumNumber(string1, string2, string3).maximum();
		if (int3 == result1)
			result = true;
		else
			result = false;
		assertEquals(true, result);
		if (float3 == result2)
			result = true;
		else
			result = false;
		assertEquals(true, result);
		if (string3 == result3)
			result = true;
		else
			result = false;
		assertEquals(true, result);

	}
}
