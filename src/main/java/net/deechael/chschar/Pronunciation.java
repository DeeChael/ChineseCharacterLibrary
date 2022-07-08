package net.deechael.chschar;

public final class Pronunciation {

    private final Phoneticization phoneticization;
    private final Tone tone;

    Pronunciation(Phoneticization phoneticization, Tone tone) {
        this.phoneticization = phoneticization;
        this.tone = tone;
    }

    public Phoneticization getPhoneticization() {
        return phoneticization;
    }

    public Tone getTone() {
        return tone;
    }

    public String getPhoneticizationString() {
        return this.phoneticization.getName();
    }


    public String getPhoneticizationStringWithV() {
        return this.phoneticization.getNameWithV();
    }

    public String getPhoneticizationStringWithTone() {
        return this.phoneticization.getName(this.tone);
    }

    public String getPhoneticizationStringWithToneAndV() {
        return this.phoneticization.getNameWithV(this.tone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pronunciation that = (Pronunciation) o;

        if (phoneticization != that.phoneticization) return false;
        return tone == that.tone;
    }

}
