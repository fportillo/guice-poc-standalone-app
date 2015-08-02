package br.com.almana;

public class TheWall implements RockPhrase {
    public String quote() {
        return "All in all you're just another brick in the wall";
    }

    public MusicalStyle getStyle() {
        return MusicalStyle.ROCK;
    }
}
