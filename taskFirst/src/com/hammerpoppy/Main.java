package com.hammerpoppy;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // menu for operations
        Scanner s = new Scanner(System.in);
        String o;

        do {
            System.out.println("Pick an operation:\na - do an operation a\nb - do an operation b\ne - exit");
            o = s.nextLine();
        } while (!o.equals("a") && !o.equals("b") && !o.equals("e"));

        switch (o) {
            case "a":
                taskA();
                break;
            case "b":
                taskB();
                break;
            case "e":
        }
    }

    private static void taskA() {
        System.out.println("Enter array size: ");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        int maxElement = array[0];
        int maxIndex = 0;
        for (int i = 2; i < n; i += 2) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        int minElement = array[1];
        int minIndex = 1;
        for (int i = 3; i < n; i += 2) {
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Max element - " + maxElement + ", it's index - " + maxIndex + "\n");
        System.out.print("Min element - " + minElement + ", it's index - " + minIndex + "\n");
    }

    private static void taskB() {
        System.out.println("Enter size of matrix and its values:");
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        boolean isSymmetrical = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetrical = false;
                }
            }
        }

        if (isSymmetrical) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
