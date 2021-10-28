import java.io.*;

public class YT_File_Write {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            FileWriter fileWriter = new FileWriter("mytextfile.txt");
            fileWriter.write("Trying to write in file.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}