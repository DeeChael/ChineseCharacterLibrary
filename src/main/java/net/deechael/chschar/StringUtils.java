package net.deechael.chschar;

public final class StringUtils {

    public static String replace(String original, String toBeReplaced, int position) {
        return original.substring(0, position - 1) + toBeReplaced + original.substring(position);
    }

}
