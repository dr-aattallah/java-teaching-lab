import java.io.*;
import java.util.Scanner;
public class TextIODemo {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("sample.txt");
        try (PrintWriter out = new PrintWriter(f)) { out.println("CPCS-203"); }
        try (Scanner in = new Scanner(f)) { System.out.println(in.nextLine()); }
    }
}
