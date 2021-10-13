import java.util.Scanner;

public class Second
{
     public static void main(String args[])
     {
          Scanner s1 = new Scanner(System.in);
          String s2 = s1.nextLine();
          String s3=new String();
          
          for(int i=s2.length()/2;i<s1.length();i++)
          {
               char c=s2.charAt(i);
               s3=s3+c;
              
          }
          System.out.println(s3);
         
    }
}
