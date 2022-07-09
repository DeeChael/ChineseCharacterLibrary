package net.deechael.chschar;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ChineseCharacterLibrary {

    final static Map<Character, ChineseCharacter> characters = new HashMap<>();

    static {
        // 因为手动查读音太慢了，生僻字不好查，在完成之前先使用这个进行简单，来自：https://github.com/belerweb/pinyin4j
        InputStream inputStream = ChineseCharacterLibrary.class.getClassLoader().getResourceAsStream("pinyins.txt");
        if (inputStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            List<String> lines = reader.lines().collect(Collectors.toList());
            try {
                reader.close();
            } catch (IOException ignored) {
            }
            for (String line : lines) {
                if (line.contains(" ")) {
                    String[] splitA = line.split(" ");
                    char character = (char) Integer.parseInt(splitA[0], 16);
                    String splitA1 = splitA[1];
                    String spiltA1R = splitA1.substring(1, splitA1.length() - 1);
                    String[] pronunciations;
                    if (spiltA1R.contains(",")) {
                        pronunciations = spiltA1R.split(",");
                    } else {
                        pronunciations = new String[] { spiltA1R };
                    }
                    ChineseCharacterBuilder builder = ChineseCharacterBuilder.builder();
                    builder.initialize(character);
                    for (String pronunciation : pronunciations) {
                        String phoneticization = pronunciation.substring(0, pronunciation.length() - 1).replace("u:", "v").replace("^", "");
                        if (phoneticization.equalsIgnoreCase("none"))
                            continue;
                        String tone = pronunciation.substring(pronunciation.length() - 1);
                        Phoneticization p = Phoneticization.valueOf(phoneticization.toUpperCase());
                        Tone t;
                        switch (Integer.parseInt(tone)) {
                            case 1:
                                t = Tone.LEVEL;
                                break;
                            case 2:
                                t = Tone.RISING;
                                break;
                            case 3:
                                t = Tone.FALLING_RISING;
                                break;
                            case 4:
                                t = Tone.FALLING;
                                break;
                            default:
                                t = Tone.SOFT;
                                break;
                        }
                        builder.pronunciation(p, t);
                    }
                    characters.put(character, builder.build());
                }
            }
        }

        // 手动
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

    @NotNull
    public static ChineseCharacter get(char c) {
        if (!characters.containsKey(c)) {
            throw new RuntimeException("Character \"" + c + "\" is not a Chinese character");
        }
        return characters.get(c);
    }

    public static boolean has(char c) {
        return characters.containsKey(c);
    }

    public static int getSupported() {
        return characters.size();
    }

    private ChineseCharacterLibrary() {}

}
