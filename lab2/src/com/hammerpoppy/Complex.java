package com.hammerpoppy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class               Complex implements Numeric {

	public String product(String fNumber, String sNumber) {
		Pattern patternA = Pattern.compile("[-]?\\d+");
		Pattern patternB = Pattern.compile("[-]?\\d+[i]");

		Matcher matcher = patternA.matcher(fNumber);
		matcher.find();
		double a1 = Integer.parseInt(matcher.group());

		matcher = patternB.matcher(fNumber);
		matcher.find();
		double b1 = Integer.parseInt(matcher.group().substring(0,matcher.group().length()-1));

		matcher = patternA.matcher(sNumber);
		matcher.find();
		double a2 = Integer.parseInt(matcher.group());

		matcher = patternB.matcher(sNumber);
		matcher.find();
		double b2 = Integer.parseInt(matcher.group().substring(0,matcher.group().length()-1));

		return (Integer.toString((int)(a1*a2 - b1*b2)) + ((a1*b2 + b1*a2) < 0 ? ("" + (int)(a1*b2 + b1*a2)) : ("+" + (int)(a1*b2 + b1*a2))) + "i");
	}
}
