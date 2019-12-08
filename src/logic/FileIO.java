/*
 * Author: Hyeokwoo Kwon
 * Created Date: Dec 8th, 2019
 *
 * data management
 */

package logic;

import kasania.model.SimpleData;
import java.io.*;

public class FileIO {

    private final String PATH = "res/data.txt";

    public FileIO() { }

    /**
     *
     * @param data write to the file
     */
    public void saveData(SimpleData data) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
            writer.write(data.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return data read from the file
     */
    public SimpleData getData() {

        SimpleData data = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {

            data = new SimpleData(reader.readLine());
        } catch (IOException e) {

            e.printStackTrace();
        }

        return data;
    }
}
