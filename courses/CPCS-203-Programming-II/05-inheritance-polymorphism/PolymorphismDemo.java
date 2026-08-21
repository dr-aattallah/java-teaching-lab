class Shape { double area() { return 0; } }
class Circle extends Shape {
    private double r;
    Circle(double r) { this.r = r; }
    @Override double area() { return Math.PI * r * r; }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s = new Circle(3);
        System.out.println(s.area());
    }
}
