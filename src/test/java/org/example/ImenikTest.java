package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    @Test
    void dajBroj() throws OsobaNePostojiException {
        Imenik imenik = new Imenik();
        imenik.dodaj("Neko Nekic", new FiksniBroj(Grad.SARAJEVO, "123-123"));
        String broj = imenik.dajBroj("Neko Nekic");
        assertEquals("033/123-123", broj);
    }

    @Test
    void dajIme() throws OsobaNePostojiException {
        Imenik imenik = new Imenik();
        imenik.dodaj("Neko Nekic", new FiksniBroj(Grad.SARAJEVO, "123-123"));
        String ime = imenik.dajIme(new FiksniBroj(Grad.SARAJEVO, "123-123"));
        assertEquals("Neko Nekic", ime);
    }

    @Test
    void dajBrojException() throws OsobaNePostojiException {
        Imenik imenik = new Imenik();
        imenik.dodaj("Neko Nekic", new FiksniBroj(Grad.SARAJEVO, "123-123"));
        assertThrows(OsobaNePostojiException.class, () -> imenik.dajBroj("Haso Hasic"));
    }
}