import java.io.*;
import java.util.Scanner;

public class YT_File_Read {
    public static void main(String[] args) {

        File myFile = new File("mytextfile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}