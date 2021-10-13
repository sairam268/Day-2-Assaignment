import java.util.Scanner;

public class Palindrome
{
     public static void main(String args[])
     {
        String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + s1.charAt(i);
 
      if (str.equals(rev))
         System.out.println(s1+"palindrome");
      else
         System.out.println(s1+"not a palindrome");
    }
}
