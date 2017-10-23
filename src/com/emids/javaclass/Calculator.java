package com.emids.javaclass;

public class Calculator {
	public static int add(String numbers) {
		String delimeter = ",|\n|;";

		String[] numbersArray = numbers.split(delimeter);

		if (numbers.isEmpty()) {
			return 0;
		} else {
			int sum = 0;
			for (String number : numbersArray) {
				char[] arr = number.toCharArray();
				String num = "";
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == '-') {
						throw new RuntimeException("the string contains negetive value");
					} else if (arr[i] >= '0' && arr[i] <= '9') {
						num = num + arr[i];
					}
				}
				int digit = Integer.parseInt(num);
				if (digit < 1000) {
					sum = sum + digit;
				}
			}

			return sum;
		}
	}
}
