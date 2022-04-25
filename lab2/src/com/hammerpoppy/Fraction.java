package com.hammerpoppy;

public class Fraction implements Numeric {

	public String product(String fNumber, String sNumber) {
		String[] sn1 = fNumber.split("/");
		String[] sn2 = sNumber.split("/");

		String[] res = new String[2];

		res[0] = Double.toString(Double.parseDouble(sn1[0]) * Double.parseDouble(sn2[0]));
		res[1] = Double.toString(Double.parseDouble(sn1[1]) * Double.parseDouble(sn2[1]));

		return (res[0] + "/" + res[1]);
	}
}
