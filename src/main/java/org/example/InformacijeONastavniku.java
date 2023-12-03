package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InformacijeONastavniku extends LicneInformacije implements MozeOcijeniti{
    private String titula;
    private List<Ocjena> ocjene;

    public InformacijeONastavniku(String ime, String prezime, String titula) {
        super(ime, prezime);
        this.titula = titula;
        this.ocjene = new ArrayList<>();
    }

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula ;
    }

    @Override
    public String predstavi() {
        return super.predstavi() + ", " + titula;
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
