package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MockitoTest {

    @Test
    void testMapa() {
        // Stvaranje mock objekta za Mapu
        Map<String, String> mockMap = Mockito.mock(HashMap.class);
        when(mockMap.get("kljuc")).thenReturn("vrijednost");
        String rezultat = mockMap.get("kljuc");

        assertEquals("vrijednost", rezultat);
    }

    @Test
    void testMetodeIzvedeneKlase() {
        IzvedenaKlasa mockIzvedenaKlasa = Mockito.mock(IzvedenaKlasa.class);
        when(mockIzvedenaKlasa.metodaIzvedeneKlase()).thenReturn("Mock implementacija");
        BaznaKlasa baznaKlasa = new BaznaKlasa(mockIzvedenaKlasa);
        String rezultat = baznaKlasa.pozoviMetoduIzvedeneKlase();
        assertEquals("Mock implementacija", rezultat);
    }
}

