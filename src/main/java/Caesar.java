import util.Input;

import java.io.IOException;

import static util.Cryptographer.*;

public class Caesar extends Input {

    public void decrypt() throws IOException {
        super.input();
        crypto(super.getText(), super.getStep(), true);
    }

    public void encrypt() throws IOException {
        super.input();
        crypto(super.getText(), super.getStep(), false);
    }

    private void crypto(String text, int step, boolean isLeftShift) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (hasAlphabetALetter(c)) {
                c = shiftChar(isLeftShift, step);
            }
            updateResult(c);
        }
        printResult(isLeftShift);
    }
}
