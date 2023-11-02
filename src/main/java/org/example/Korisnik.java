package org.example;

public class Korisnik extends Osoba{

    Racun racun;
    public Korisnik(String ime, String prezime) {
        super(ime, prezime);
    }
    public void dodajRacun(Racun racun) {
        this.racun = racun;
    }
}
