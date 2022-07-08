package net.deechael.chschar;

public enum Finals {

    A("a", "ā", "á", "ǎ", "à"),
    O("o", "ō", "ó", "ǒ", "ò"),
    E("e", "ē", "é", "ě", "è"),
    I("i", "ī", "í", "ǐ", "ì"),
    U("u", "ū", "ú", "ǔ", "ù"),
    V("ü", "ǖ", "ǘ", "ǚ", "ǜ"),
    UNKNOWN("", "", "", "", "");

    private final String character;
    private final String levelChar;
    private final String risingChar;
    private final String fallingRisingChar;
    private final String fallingChar;

    Finals(String character, String levelChar, String risingChar, String fallingRisingChar, String fallingChar) {
        this.character = character;
        this.levelChar = levelChar;
        this.risingChar = risingChar;
        this.fallingRisingChar = fallingRisingChar;
        this.fallingChar = fallingChar;
    }

    public String getCharacter(Tone tone) {
        switch (tone) {
            case LEVEL:
                return this.getLevelCharacter();
            case RISING:
                return this.getRisingCharacter();
            case FALLING_RISING:
                return this.getFallingRisingCharacter();
            case FALLING:
                return this.getFallingCharacter();
        }
        return this.getSoftCharacter();
    }

    public String getCharacter() {
        return character;
    }

    public String getSoftCharacter() {
        return character;
    }


    public String getLevelCharacter() {
        return levelChar;
    }

    public String getRisingCharacter() {
        return risingChar;
    }

    public String getFallingRisingCharacter() {
        return fallingRisingChar;
    }

    public String getFallingCharacter() {
        return fallingChar;
    }

}
