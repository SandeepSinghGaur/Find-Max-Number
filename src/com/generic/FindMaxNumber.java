package com.generic;

public class FindMaxNumber {

	static class MaximumNumber<T extends Comparable<T>> {
		T num1, num2, num3;

		public MaximumNumber(T num1, T num2, T num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}

		public T maximum() {
			return MaximumNumber.maximum(num1, num2, num3);
		}

		public static <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {
			T max = num1;
			if (num2.compareTo(max) > 0) {
				max = num2;
			}
			if (num3.compareTo(max) > 0) {
				max = num3;
			}
			printMax(num1, num2, num3, max);
			return max;
		}

		public static <T> void printMax(T num1, T num2, T num3, T max) {
			System.out.println("Max is" + " " + max);
		}
	}

}
