package net.deechael.chschar;

class ChineseCharacterBuilder {

    private ChineseCharacter character;

    private ChineseCharacterBuilder() {
    }

    ChineseCharacterBuilder initialize(char c) {
        this.character = new ChineseCharacter(c);
        return this;
    }

    ChineseCharacterBuilder pronunciation(Phoneticization phoneticization, Tone tone) {
        this.character.addPronunciation(new Pronunciation(phoneticization, tone));
        return this;
    }


    static ChineseCharacterBuilder builder() {
        return new ChineseCharacterBuilder();
    }

}
