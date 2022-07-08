package net.deechael.chschar;

import java.util.ArrayList;
import java.util.List;

public final class ChineseCharacter {

    private final char character;
    private final List<Pronunciation> pronunciations = new ArrayList<>();

    ChineseCharacter(char character) {
        this.character = character;
    }

    void addPronunciation(Pronunciation pronunciation) {
        if (this.pronunciations.contains(pronunciation))
            return;
        this.pronunciations.add(pronunciation);
    }

    public char getCharacter() {
        return character;
    }

    public List<Pronunciation> getPronunciations() {
        return new ArrayList<>(pronunciations);
    }

}
