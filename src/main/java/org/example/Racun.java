package org.example;

public class Racun {

    Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    public Racun(Long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }

    public void odobriPrekoracenje(Double n) {              //Skidaju se sredstva sa racuna ali je prekoracenje odobreno
        stanjeRacuna -= n;
        this.odobrenjePrekoracenja = true;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double n) {
        return this.odobrenjePrekoracenja;
    }

    public boolean izvrsiUplatu(Double n) {
        this.stanjeRacuna+=n;
        return true;
    }
    public boolean izvrsiIsplatu(Double n) {
        if (n > this.stanjeRacuna && !this.provjeriOdobrenjePrekoracenja(n)) return false;
        else {
            this.stanjeRacuna -= n;
            return true;
        }

    }


}
