import java.util.Scanner;

public class Firsthalf
{
     public static void main(String args[])
     {
          Scanner s1 = new Scanner(System.in);
          String s2 = s1.nextLine();
          String s3=new String();
          
          for(int i=0;i<s2.length()/2;i++)
          {
               char character = s2.charAt(i);
               s3=s3+character;
              
          }
          System.out.println(s3);
         
    }
}
