import java.util.Scanner;

public class object
 {
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);

        while(true)
        {
        System.out.println("enter q to exit");
        System.out.println("enter your name:");
        String a =sc.next();
        if(a.equals("q")) 
        {
            System.out.println("happy coding");
            sc.close();
            System.exit(0);
        }
        else if(a.length()<3 || a.length()>8)
        System.out.println("invalid name");

        else
         {
            System.out.println("enter your name:");
        }
        }
    }