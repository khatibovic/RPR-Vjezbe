package org.example;

import java.util.HashMap;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }


}
