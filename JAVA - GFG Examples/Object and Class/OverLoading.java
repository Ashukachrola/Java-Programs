class Helper {
    public int Multiply(int a, int b){
        return a * b;
    }

    public double Multiply(double a, double b){
        return a * b;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Helper h = new Helper();
    
        System.out.println(h.Multiply(2, 2));
        System.out.println(h.Multiply(2.0, 2.0));
    }
}
