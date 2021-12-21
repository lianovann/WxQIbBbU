package util;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Input {

    private String text;
    private int step;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a text: ");
        text = scanner.nextLine();
        System.out.print("Input a step of shift: ");
        step = scanner.nextInt();
    }
}
