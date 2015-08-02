package br.com.almana;

/**
 * Created by francisco on 8/1/15.
 */
public class Love implements RockPhrase {
    public String quote() {
        return "All you need is love";
    }

    public MusicalStyle getStyle() {
        return MusicalStyle.ROCK;
    }
}
