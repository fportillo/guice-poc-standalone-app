package br.com.almana;

import br.com.almana.binding.annotations.NoPagode;

public class SPC implements RockPhrase {
    @NoPagode public String quote() {
        return "Toda vez que eu chego em casa...";
    }

    public MusicalStyle getStyle() {
        return MusicalStyle.PAGODE;
    }
}
