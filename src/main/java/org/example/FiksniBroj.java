package org.example;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
}
