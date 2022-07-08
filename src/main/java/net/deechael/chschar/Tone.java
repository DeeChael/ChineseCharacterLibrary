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

    public static Tone valueOf(int id) {
        switch (id) {
            case 1:
                return LEVEL;
            case 2:
                return RISING;
            case 3:
                return FALLING_RISING;
            case 4:
                return FALLING;
        }
        return SOFT;
    }

}
