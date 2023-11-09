package org.example;

public class BaznaKlasa {
    private IzvedenaKlasa izvedenaKlasa;

    public BaznaKlasa(IzvedenaKlasa izvedenaKlasa) {
        this.izvedenaKlasa = izvedenaKlasa;
    }

    public String pozoviMetoduIzvedeneKlase() {
        return izvedenaKlasa.metodaIzvedeneKlase();
    }
}
