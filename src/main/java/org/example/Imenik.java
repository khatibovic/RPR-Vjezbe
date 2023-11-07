package org.example;

import java.util.HashMap;
import java.util.Map;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();
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
    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue().equals(broj)) return entry.getKey();
        }
        return "U imeniku ne postoji osoba sa tim imenom!";
    }

    public String naSlovo(char s) {
        StringBuilder ispis = new StringBuilder();
        int i = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String ime = entry.getKey();
            if (ime.charAt(0) == 's') {
                ispis.append(i).append(".").append(ime).append(" - ").append(entry.getValue().ispisi()).append("\n");
            }
        }
    }

}
