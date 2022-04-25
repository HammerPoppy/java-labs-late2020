package com.hammerpoppy;

import org.ejml.data.DMatrix3x3;
import org.ejml.ops.MatrixIO;
import org.ejml.simple.SimpleMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Setting first matrix
        System.out.println("Please enter sizes of matrix 1:");

        int[] sizes1 = askSizes(s);
//        int[] sizes1 = {2, 2};

        System.out.println("Please enter values of matrix 1:");

        double[][] values1 = askValues(s, sizes1);
//        double[][] values1 = {{1, 2}, {3, 4}};
        SimpleMatrix matrix1 = new SimpleMatrix(values1);

        // Setting second matrix
        System.out.println("Please enter sizes of matrix 2:");

        int[] sizes2 = askSizes(s);
//        int[] sizes2 = {2, 2};

        System.out.println("Please enter values of matrix 1:");

        double[][] values2 = askValues(s, sizes2);
//        double[][] values2 = {{4, 3}, {2, 1}};
        SimpleMatrix matrix2 = new SimpleMatrix(values2);

        boolean isAbleToAddSub = Arrays.equals(sizes1, sizes2);
        boolean isAbleToMult = sizes1[1] == sizes2[0];

        if (!isAbleToAddSub && !isAbleToMult) {
            System.out.println("Sorry you cant do any operations with this matrices");
            return;
        }

        String op = askOperation(s, isAbleToAddSub, isAbleToMult);

        switch (op) {
            case "a":
                matrix1.plus(matrix2).print();
                break;
            case "s":
                matrix1.minus(matrix2).print();
                break;
            case "m":
                matrix1.mult(matrix2).print();
                break;
        }

    }

    private static String askOperation(Scanner s, boolean isAbleToAddSub, boolean isAbleToMult) {
        System.out.print("Please choose operation ");
        if (isAbleToAddSub) {
            System.out.print("a - Add; s - Substract");
        }

        if (isAbleToMult) {
            if (isAbleToAddSub) {
                System.out.print("; ");
            }
            System.out.print("m - Multiplicate");
        }

        System.out.println(":");
        String op = s.next();
        return op;
    }

    private static double[][] askValues(Scanner s, int[] sizes) {
        double[][] values = new double[sizes[0]][sizes[1]];

        for (int i = 0; i < sizes[0]; i++) {
            for (int j = 0; j < sizes[1]; j++) {
                values[i][j] = s.nextInt();
            }
        }

        return values;
    }

    private static int[] askSizes(Scanner s) {
        int[] sizes = new int[2];

        sizes[0] = s.nextInt();
        sizes[1] = s.nextInt();
        return sizes;
    }
}
