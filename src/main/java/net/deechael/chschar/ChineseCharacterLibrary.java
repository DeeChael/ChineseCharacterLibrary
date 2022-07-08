package net.deechael.chschar;

import java.util.HashMap;
import java.util.Map;

public final class ChineseCharacterLibrary {

    final static Map<Character, ChineseCharacter> characters = new HashMap<>();

    static {
        characters.put('㐀', ChineseCharacterBuilder.builder().initialize('㐀').pronunciation(Phoneticization.QIU, Tone.LEVEL).build());
        characters.put('㐁', ChineseCharacterBuilder.builder().initialize('㐁').pronunciation(Phoneticization.TIAN, Tone.FALLING_RISING).pronunciation(Phoneticization.TIAN, Tone.FALLING).build());
        characters.put('㐂', ChineseCharacterBuilder.builder().initialize('㐂').pronunciation(Phoneticization.XI, Tone.FALLING_RISING).build());
        characters.put('㐄', ChineseCharacterBuilder.builder().initialize('㐄').pronunciation(Phoneticization.KUA, Tone.FALLING).build());
        characters.put('㐅', ChineseCharacterBuilder.builder().initialize('㐅').pronunciation(Phoneticization.WU, Tone.FALLING_RISING).build());
        characters.put('㐆', ChineseCharacterBuilder.builder().initialize('㐆').pronunciation(Phoneticization.YIN, Tone.FALLING_RISING).pronunciation(Phoneticization.YI, Tone.LEVEL).build());
        characters.put('㐇', ChineseCharacterBuilder.builder().initialize('㐇').pronunciation(Phoneticization.JIU, Tone.FALLING_RISING).build());
        characters.put('㐈', ChineseCharacterBuilder.builder().initialize('㐈').pronunciation(Phoneticization.RU, Tone.FALLING).build());
        characters.put('㐉', ChineseCharacterBuilder.builder().initialize('㐉').pronunciation(Phoneticization.DING, Tone.LEVEL).build());
        characters.put('㐊', ChineseCharacterBuilder.builder().initialize('㐊').pronunciation(Phoneticization.SHI, Tone.FALLING).build());
        characters.put('㐋', ChineseCharacterBuilder.builder().initialize('㐋').pronunciation(Phoneticization.TU, Tone.FALLING_RISING).build());
    }

    public static ChineseCharacter get(char c) {
        if (!characters.containsKey(c)) {
            throw new RuntimeException("Character \"" + c + "\" is not a Chinese character");
        }
        return characters.get(c);
    }

    private ChineseCharacterLibrary() {}

}
