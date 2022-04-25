package com.hammerpoppy;

public class Real implements Numeric {

	public String product(String fNumber, String sNumber) {
		double n1 = Double.parseDouble(fNumber);
		double n2 = Double.parseDouble(sNumber);

		return Double.toString(n1 * n2);
	}
}
