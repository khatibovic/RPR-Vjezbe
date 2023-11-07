package org.example;

import java.util.HashMap;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        TelefonskiBroj broj = imenik.get(ime);
        if(broj != null) {
            return broj.ispisi();
        }
        return "Osoba sa tim imenom ne postoji u imeniku";
    }

}
