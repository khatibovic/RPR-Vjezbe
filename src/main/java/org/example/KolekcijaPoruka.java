package org.example;

import java.util.ArrayList;
import java.util.List;

public class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<String> poruke) {
        this.poruke = new ArrayList<>();

    }

    public List<String> getPoruke() {
        return poruke;
    }
}
