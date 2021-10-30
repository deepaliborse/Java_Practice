import java.io.*;

class WriteInput
{
public static void main(String args[])
{
try 
{
File fl=new File("/home/deepali/Documents/Java/Lab/myfile.txt");

String str="Write this string to my file";

FileWriter fw = new FileWriter(fl);

fw.write(str);

fw.close();

}

catch(IOException e)
{
e.printStackTrace();
}
}
}
