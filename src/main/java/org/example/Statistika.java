package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Statistika {
    public static void main(String[] args) {
        List<Double> brojevi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite brojeve (za prekid unosa unesite 'stop')");
        while (true) {
            String unos = sc.next();
            if (unos.equalsIgnoreCase("stop")) break;
            try {
                double br = Double.parseDouble(unos);
                brojevi.add(br);
            }
            catch (NumberFormatException e) {
                System.out.println("Niste unijeli broj!!!");
            }
        }

        if (brojevi.isEmpty()) {
            System.out.println("Niste unijeli nijedan broj.");
        }
        else {
            double min = Collections.min(brojevi);
            double max = Collections.max(brojevi);
            double suma = 0;
            for (double x : brojevi) {
                suma += x;
            }
            double mean = suma/ brojevi.size();
            double varijansa = 0;
            for (double x : brojevi) {
                varijansa += Math.pow(x-mean,2);
            }

            double stDevijacija = Math.sqrt(varijansa/ brojevi.size());


            System.out.println("Minimum : "+min);
            System.out.println("Maksimum : "+max);
            System.out.println("Mean : "+mean);
            System.out.println("Standardna devijacija: "+stDevijacija);
        }
    }
}