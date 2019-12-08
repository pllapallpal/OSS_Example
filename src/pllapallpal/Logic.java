package pllapallpal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Logic {

    Scanner fileInput;
    private String data;
    private final String PATH = "res/data.txt";

    public Logic() {
        fileInput = null;
    }

    public void readFile() {
        try {
            fileInput = new Scanner(new File(PATH));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getData() {
        return data;
    }
}
