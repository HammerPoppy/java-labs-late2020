package com.hammerpoppy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Enter n:");
            n = s.nextInt();
        } while (n < 1);

        a = new int[n];

        System.out.println("n is " + n);
        System.out.println("Enter n decimal nums:");

        for (int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        System.out.println("You entered an array:");
        for (int value : a) {
            System.out.print(value + "; ");
        }

        System.out.println("\nYour array inversed:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + "; ");
        }
    }
}
