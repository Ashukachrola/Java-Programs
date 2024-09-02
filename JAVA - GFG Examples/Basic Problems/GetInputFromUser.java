import java.util.Scanner;
import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputFromUser {

    // //1 -- Using Buffered Reader class----------------------------------------------------------------
    // public static void main(String[] args)
    // throws IOException
    // {
    //     BufferedReader reader = new BufferedReader(
    //         new InputStreamReader(System.in)
    //     );

    //     // Creates an InputStreamReader object that reads bytes from the standard input (console) and converts them to characters.

    //     String name = reader.readLine();

    //     System.out.println(name);
    // }


    // //2 -- Using Scanner class----------------------------------------------------------
    // public static void main(String[] args)
    // {
    //     System.out.println("Enter Name:");

    //     Scanner sc = new Scanner(System.in);

    //     String name = sc.nextLine();

    //     System.out.println("Hello " + name +"!");
    // }


    // //3 -- Using Console class--------------------------------------------------
    // public static void main(String[] args) {
    //     String name  = System.console().readLine();

    //     System.out.println("Hello" +name+"!");
    // }

    // //4 -- Using Command Line arguments---------------------------------------------
    // public static void main(String[] args) {
    //     if(args.length > 0)
    //     {
    //         System.out.println("Command line arguments are : ");

    //         for(String val : args)
    //         System.out.println(val);
    //     }
    //     else
    //     {
    //         System.out.println("No command line argument found");
    //     }
    // }
}
