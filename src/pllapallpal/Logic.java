package pllapallpal;

import java.io.*;

public class Logic {

    private final String PATH = "res/data.txt";
    private String data;

    public Logic() {
        data = null;
    }

    public void readFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {

            reader.lines().forEach(str -> {
                data = data + str + "\n";
            });

        } catch (IOException e) {

            e.printStackTrace();
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
