public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
    }
}
