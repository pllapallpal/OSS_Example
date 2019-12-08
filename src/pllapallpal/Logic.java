package pllapallpal;

import java.io.*;
import java.util.Scanner;

public class Logic {

    private Scanner fileInput;

    private final String PATH = "res/data.txt";
    private String data;

    public Logic() {
        fileInput = null;
    }

    public void readFile() {

        try {
            fileInput = new Scanner(new File(PATH));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        while (fileInput.hasNextLine()) {
            data = data + fileInput.nextLine() + "\n";
        }
    }

    public void writeFile(String data) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getData() {
        return data;
    }
}
