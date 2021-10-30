import java.io.*;

class TestInput
{
public static void main(String args[])    //Can give IOException but instead generalising we'll use Excption 
{

try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

char c=(char)br.read(); //Type casting to character

System.out.println(c);

String s=br.readLine();

System.out.println(s);

}
catch(IOException e)
{
e.printStackTrace();
}
}
}
