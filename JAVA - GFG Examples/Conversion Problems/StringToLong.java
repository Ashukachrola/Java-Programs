public class StringToLong {
    public static void main(String[] args) {
        String str = "123456";
        System.out.println("String : "+str);

        long varlong = Long.parseLong(str);

        System.out.println("Long : "+varlong);
    }
}
