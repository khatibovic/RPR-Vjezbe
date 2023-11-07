package org.example;

public enum Grad {
    BIHAC("037"),
    ORASJE("031"),
    TUZLA("035"),
    ZENICA("032"),
    GORAZDE("038"),
    TRAVNIK("030"),
    MOSTAR("036"),
    SIROKI("039"),
    SARAJEVO("033"),
    LIVNO("034"),
    BRCKO("049"),
    MRKONJICGRAD("050"),
    BANJALUKA("051"),
    PRIJEDOR("052"),
    DOBOJ("053"),
    SAMAC("054"),
    BIJELJINA("055 "),
    ZVORNIK("056"),
    PALE("057"),
    FOCA("058"),
    TREBINJE("059");

    private final String pozivniBroj;

    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }
}