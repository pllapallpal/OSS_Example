package pllapallpal;

import java.io.*;

public class Logic {

    private BufferedReader fileInput;

    private final String PATH = "res/data.txt";
    private String data;

    public Logic() {
        fileInput = null;
    }

    public void readFile() {

        // read the file from the path
        try {
            fileInput = new BufferedReader(new FileReader(PATH));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        // get the data from the file
        String currentLine;
        try {
            while ((currentLine = fileInput.readLine()) != null) {
                data = data + currentLine + "\n";
            }
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
