public class YT_ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try{
            int result=a/b;
            System.out.println("Division is: " + result);
        }
        catch(Exception e){
            System.out.println("Divide by 0 error!");
            System.out.println(e);
        }
        System.out.println("\nOutside try-catch block!!");
    }
}
