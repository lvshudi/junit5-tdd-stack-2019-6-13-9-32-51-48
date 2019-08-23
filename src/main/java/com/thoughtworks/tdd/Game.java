package com.thoughtworks.tdd;

public class Game {

	public String fizzBuzz(int i) {
		String result = "";
		String FIZZ = "fizz";

		if (i % 3 == 0) {
			result += FIZZ;
		}
		if (i % 5 == 0) {
			result += "buzz";
		}
		if (i % 7 == 0) {
			result += "whizz";
		}
		if (result.equals("")) {
			return String.valueOf(i);
		} else {
			return result;
		}
		
	}

}
