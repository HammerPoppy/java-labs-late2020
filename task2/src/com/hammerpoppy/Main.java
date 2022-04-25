package com.hammerpoppy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter 4 points by x and y coordinates, for example: \n-1 1\n 1 1\n 1 -1\n-1 -1\nInput:\n");

        int num = 4;
        double[] xs = new double[num];
        double[] ys = new double[num];

        // getting points
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            xs[i] = s.nextDouble();
            ys[i] = s.nextDouble();
        }

        // calculating center point's coordinates
        double centerX = 0, centerY = 0;
        for (int i = 0; i < num; i++) {
            centerX += xs[i];
            centerY += ys[i];
        }
        centerX /= num;
        centerY /= num;

        // calculating distances from center to points
        double[] distances = new double[num];
        for (int i = 0; i < num; i++) {
            distances[i] = Math.sqrt(Math.abs(centerX - xs[i])) + Math.sqrt(Math.abs(centerY - ys[i]));
        }

        // if distances equal it's a rectangle
        if (distances[0] == distances[1] && distances[0] == distances[2] && distances[0] == distances[3]) {
            System.out.println("It is rectangle indeed");
        } else {
            System.out.println("It is not rectangle :(");
        }
    }
}
