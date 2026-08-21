interface Printable { void print(); }
abstract class Document { abstract String title(); }
class Report extends Document implements Printable {
    String title() { return "Course Report"; }
    public void print() { System.out.println(title()); }
}
public class InterfaceDemo {
    public static void main(String[] args) { new Report().print(); }
}
