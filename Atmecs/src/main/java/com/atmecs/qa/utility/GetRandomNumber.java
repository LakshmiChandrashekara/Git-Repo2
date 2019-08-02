package com.atmecs.qa.utility;

public class GetRandomNumber {
	public int generateRandomNumber(int maximum, int minimum) {
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}
}
