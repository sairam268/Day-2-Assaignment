import java.util.Scanner;

public class Hash
{
     public static void main(String args[])
     {
          Scanner s1 = new Scanner(System.in);
          String s2 = s1.nextLine();
          String s3 = s1.nextLine();
          System.out.println("Hashcode for "+s2+" = " + s2.hashCode());
          System.out.println("Hashcode for "+s3+" = " + s3.hashCode());
    }
}
