package org.example;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    @Override
    public String ispisi() {
        return grad.getPozivniBroj()+"/"+broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }
}
