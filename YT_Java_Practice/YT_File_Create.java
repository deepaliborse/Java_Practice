import java.io.*;

public class YT_File_Create {
    public static void main(String[] args) {

        File myFile = new File("mytextfile.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}