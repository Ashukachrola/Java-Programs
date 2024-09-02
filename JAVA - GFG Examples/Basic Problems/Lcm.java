import java.util.*;

public class Lcm {
    public static void main(String[] args) {

        int hcf = 1;

        System.out.println("Enter two numbers : ");

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //find GCD - gretest common fector

        for(int i = 1; i <= n1 && i <= n2; i++)
        {
            if(n1 % i == 0 && n2 % i ==0)
            {
                hcf = i;
            }
        }

        int lcm = (n1 * n2)/hcf;

        System.out.println("LCM : "+lcm);
    }
}
