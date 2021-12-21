import util.Input;

import static util.Cryptographer.*;

public class Caesar {

    private String text;
    private int step;

    public void decrypt() {
        userInput();
        crypto(text, step, true);
    }

    public void encrypt() {
        userInput();
        crypto(text, step, false);
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

    private void userInput() {
        Input input = new Input();
        input.input();
        text = input.getText();
        step = input.getStep();
    }
}
