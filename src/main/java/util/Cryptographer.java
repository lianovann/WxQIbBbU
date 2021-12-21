package util;

import static util.Constants.RUSSIAN_ALPHABET_LOW_CASE;
import static util.Constants.RUSSIAN_ALPHABET_UPPER_CASE;

public class Cryptographer {

    private static char[] chosenAlphabet;
    private static int stepCount;
    private static String result = "";

    public static boolean hasAlphabetALetter(char charFromText) {
        stepCount = 0;
        for (char c : RUSSIAN_ALPHABET_LOW_CASE.toCharArray()) {
            if (charFromText == c) {
                chosenAlphabet = RUSSIAN_ALPHABET_LOW_CASE.toCharArray();
                return true;
            }
            stepCount++;
        }
        stepCount = 0;
        for (char c : RUSSIAN_ALPHABET_UPPER_CASE.toCharArray()) {
            if (charFromText == c) {
                chosenAlphabet = RUSSIAN_ALPHABET_UPPER_CASE.toCharArray();
                return true;
            }
            stepCount++;
        }
        return false;
    }

    public static void updateResult(char charFromText) {
        result += charFromText;
    }

    public static void printResult(Boolean isLeft) {
        if (isLeft) {
            System.out.println("DECRYPTED: " + result);
        } else {
            System.out.println("ENCRYPTED: " + result);
        }
        result = "";
    }

    public static Character shiftChar(Boolean sideOfShift, int step) {
        if (sideOfShift) {
            return shiftCharToLeft(step, chosenAlphabet);
        } else {
            return shiftCharToRight(step, chosenAlphabet);
        }
    }

    private static char shiftCharToLeft(int step, char[] listOfChars) {
        int count = stepCount - step;
        if (count < 0) {
            count += listOfChars.length;
        }
        return listOfChars[count];
    }

    private static char shiftCharToRight(int step, char[] listOfChars) {
        int count = stepCount + step;
        if (count >= listOfChars.length) {
            count -= listOfChars.length;
        }
        return listOfChars[count];
    }
}
