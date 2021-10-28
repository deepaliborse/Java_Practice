import java.io.*;
import java.util.*;

public class YT_File_Delete {
    public static void main(String[] args) {

        File myFile = new File("mytextfile.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }

}