package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    public Banka() {
        brojRacuna = null;
        korisnici = new ArrayList<Korisnik>();
        uposlenici = new ArrayList<Uposlenik>();
    }
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik korisnik = new Korisnik(ime, prezime);
        korisnici.add(korisnik);
        return korisnik;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        Uposlenik uposlenik = new Uposlenik(ime, prezime);
        uposlenici.add(uposlenik);
        return uposlenik;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k) {
        Long brRacuna = new Random().nextLong();
        return new Racun(brRacuna, k);
    }

}
