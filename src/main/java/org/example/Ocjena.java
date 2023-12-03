package org.example;

public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;

    public Ocjena(LicneInformacije osoba, int ocjena) {
        this.osoba = osoba;
        if (ocjena > 0 && ocjena <= 10) {
            this.ocjena = ocjena;
        } else {
            System.out.println("Neispravna ocjena. Ocjena mora biti između 1 i 10.");
        }
    }

    public LicneInformacije getOsoba() {
        return osoba;
    }

    public void setOsoba(LicneInformacije osoba) {
        this.osoba = osoba;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }
}
