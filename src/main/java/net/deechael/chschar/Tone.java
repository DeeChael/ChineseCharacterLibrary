package net.deechael.chschar;

public enum Tone {

    SOFT(0),
    LEVEL(1),
    RISING(2),
    FALLING_RISING(3),
    FALLING(4);

    private final int id;

    Tone(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
