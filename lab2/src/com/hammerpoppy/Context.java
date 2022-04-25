package com.hammerpoppy;

public class Context {
	private Numeric numeric;

	public void setNumeric(Numeric numeric) {
		this.numeric = numeric;
	}

	public String findProduct(String firstNumber, String secondNumber) {
		return numeric.product(firstNumber, secondNumber);
	}
}
