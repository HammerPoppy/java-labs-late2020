package com.hammerpoppy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // menu for operations
        Scanner s = new Scanner(System.in);
        String o;

        do {
            System.out.println("Pick an operation:\na - do an operation\ne - exit");
            o = s.nextLine();
        } while (!o.equals("a") && !o.equals("e"));

        // exit if "e"
        if (o.equals("e")){
            return;
        }

        // reading from file
        File file = new File("test.txt");
        Scanner sF = new Scanner(file);

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> modifiedStrings = new ArrayList<>();
        while (sF.hasNextLine()) {
            strings.add(sF.nextLine());
        }

        // processing all strings
        double ratio = 28.4;
        String curString;
        for (int i = 0; i < strings.size(); i++) {
            curString = strings.get(i);

            // parsing price value
            int indexLast = curString.indexOf("$");
            int indexFirst = indexLast;
            do {
                indexFirst--;
            } while (curString.charAt(indexFirst) != '|');
            indexFirst++;
            double priceDollars = Double.parseDouble(curString.substring(indexFirst, indexLast));

            // calc price in hryvnias and concat it to strings
            double priceHryvnias = priceDollars * ratio;
            modifiedStrings.add(strings.get(i).concat(priceHryvnias + "₴"));
        }

        // writing back to file
        FileWriter writer = new FileWriter("test.txt");
        for (int i = 0; i < modifiedStrings.size(); i++) {
            writer.write(modifiedStrings.get(i) + "\n");
        }
        writer.close();

        System.out.println("Done");
    }
}
