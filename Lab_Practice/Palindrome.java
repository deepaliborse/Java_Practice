import java.util.*;

class Palindrome
{
public static void main(String args[])
{
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
int sum=0,r;
 int temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;   
   n=n/10;         
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  

}
