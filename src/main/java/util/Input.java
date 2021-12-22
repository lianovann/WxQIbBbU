package util;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Getter
public class Input {

    private String text;
    private int step;

    public void input() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Input a text: ");
        text = bufferedReader.readLine();
        System.out.print("Input a step of shift: ");
        step = Integer.parseInt(bufferedReader.readLine());
    }
}
