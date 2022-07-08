package net.deechael.chschar;

public final class StringUtils {

    public static String replace(String original, String toBeReplaced, int position) {
        return original.substring(0, position) + toBeReplaced + original.substring(position + 1);
    }

}
