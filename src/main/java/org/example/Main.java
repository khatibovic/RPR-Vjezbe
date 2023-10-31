package org.example;

import java.util.Scanner;

import static org.example.SinFact.Faktorijel;
import static org.example.SinFact.Sinus;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Unesi broj kojem zelis izracunati sinus i faktorijel : ");
        n = sc.nextInt();
        System.out.println("Sinus broja "+n+" je "+Sinus(n)+" a faktorijel je "+Faktorijel(n));
    }
}