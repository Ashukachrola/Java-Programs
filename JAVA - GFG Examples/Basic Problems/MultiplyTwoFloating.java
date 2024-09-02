import java.io.*;
import java.util.Scanner;

public class MultiplyTwoFloating {
    public static void main(String[] args) {
        float n1, n2;

        System.out.println("Enter Two Number : ");

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();

        float ans = n1 * n2;

        System.out.println("Multiplication of two float is = "+ans);
    }
}
