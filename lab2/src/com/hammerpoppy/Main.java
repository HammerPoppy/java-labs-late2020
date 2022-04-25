package com.hammerpoppy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Context context = new Context();

        System.out.print("1 - Real\n2 - Fraction\n3 - Complex\nInput numeric type: ");
        int nType = read.nextInt();
        System.out.print("Input numeric_1: ");
        String n1 = read.next();
        System.out.print("Input numeric_2: ");
        String n2 = read.next();

        switch (nType) {
            case 2: context.setNumeric(new Fraction()); break;
            case 3: context.setNumeric(new Complex()); break;
            default: context.setNumeric(new Real());
        }

        System.out.println(n1 + " * " + n2 + " = " + context.findProduct(n1, n2));
        read.close();
    }
}
