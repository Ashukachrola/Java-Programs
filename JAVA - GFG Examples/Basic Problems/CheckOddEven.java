public class CheckOddEven {

    //using bitwise OR---------------------------------
    public static void main(String[] args) {
        int n = 100;
 
        // Condition check
        // if n|1 if greater than n then this number is even
        if ((n | 1) > n) {
 
            // Print statement
            System.out.println("Number is Even");
        }
        else {
 
            // Print statement
            System.out.println("Number is Odd");
        }
    }
}
