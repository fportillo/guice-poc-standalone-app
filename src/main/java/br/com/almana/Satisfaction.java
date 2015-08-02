package br.com.almana;

import br.com.almana.binding.annotations.NoPagode;

/**
 * Created by francisco on 8/2/15.
 */
public class Satisfaction implements RockPhrase {
    public String quote() {
        return "I can't get no satisfaction";
    }

    public MusicalStyle getStyle() {
        return MusicalStyle.ROCK;
    }
}
