package org.example;

public class SinFact {

    public static double Sinus(double n) {
        return Math.sin(Math.toRadians(n));
    }

    public static long Faktorijel(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Faktorijel se ne moze racunati za negativne brojeve!");
        }
        if (n==0 || n==1) {
            return 1;
        }
        long fakt = 1;
        for (int i = 2; i <= n; i++) {
            fakt = fakt * i;
        }
        return fakt;
    }
}
