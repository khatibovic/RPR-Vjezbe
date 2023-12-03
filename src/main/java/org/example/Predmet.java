package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Predmet implements MozeOcijeniti{
     private String naziv;
     private String opis;
    private List<Ocjena> ocjene;

    public Predmet(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
        this.ocjene = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    public void setOcjene(List<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }

    @Override
    public Ocjena ocijeni(int ocjena) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite svoje ime: ");
        String ime = scanner.nextLine();
        System.out.println("Unesite svoje prezime: ");
        String prezime = scanner.nextLine();
        LicneInformacije osoba = new LicneInformacije(ime, prezime);

        Ocjena novaOcjena = new Ocjena(osoba, ocjena);
        ocjene.add(novaOcjena);
        return novaOcjena;
    }
}
