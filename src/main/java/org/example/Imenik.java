package org.example;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) throws OsobaNePostojiException {
        TelefonskiBroj broj = imenik.get(ime);
        if(broj != null) {
            return broj.ispisi();
        }
        else throw new OsobaNePostojiException("Osoba sa tim imenom ne postoji u imeniku");
    }
    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue().equals(broj)) return entry.getKey();
        }
        return "U imeniku ne postoji osoba sa tim imenom!";
    }

    public String naSlovo(char s) {
        StringBuilder ispis = new StringBuilder();  //koristimo za kreiranje stringa koji sadrzi spisak telefonskih brojeva ljudi cije ime pocinje odredjenim slovom
        int i = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String ime = entry.getKey();
            if (ime.charAt(0) == 's') {
                ispis.append(i).append(".").append(ime).append(" - ").append(entry.getValue().ispisi()).append("\n");
                i++;
            }
        }

        return ispis.toString();
    }

    public Set<String> izGrada(Grad g) {
        Set<String> osobe = new TreeSet<>();

        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            String ime = entry.getKey();
            TelefonskiBroj broj  = entry.getValue();
            if (broj instanceof FiksniBroj) {
                FiksniBroj fiksni = (FiksniBroj) broj;
                if(fiksni.getGrad() == g) {
                    osobe.add(ime);
                }
            }
        }
        return osobe;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojevi = new TreeSet<>(Comparator.comparing(TelefonskiBroj::ispisi));

        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            TelefonskiBroj broj  = entry.getValue();
            if (broj instanceof FiksniBroj) {
                FiksniBroj fiksni = (FiksniBroj) broj;
                if(fiksni.getGrad() == g) {
                    brojevi.add(broj);
                }
            }

        }
        return brojevi;
    }

}
