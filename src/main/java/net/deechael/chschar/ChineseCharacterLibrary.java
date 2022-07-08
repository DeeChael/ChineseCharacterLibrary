package net.deechael.chschar;

import java.util.HashMap;
import java.util.Map;

public final class ChineseCharacterLibrary {

    final static Map<Character, ChineseCharacter> characters = new HashMap<>();

    static {

    }

    public static ChineseCharacter get(char c) {
        if (!characters.containsKey(c)) {
            throw new RuntimeException("Character \"" + c + "\" is not a Chinese character");
        }
        return characters.get(c);
    }

    private ChineseCharacterLibrary() {}

}
