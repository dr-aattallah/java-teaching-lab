import java.util.Scanner;
public class VariablesAndInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Value = " + n);
        in.close();
    }
}
