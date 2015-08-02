package br.com.almana;

/**
 * Created by francisco on 8/1/15.
 */
public class Champions implements RockPhrase {
    public String quote() {
        return "We are the champions, my friend";
    }

    public MusicalStyle getStyle() {
        return MusicalStyle.ROCK;
    }
}
