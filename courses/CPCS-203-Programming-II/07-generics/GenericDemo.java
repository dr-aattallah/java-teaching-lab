class Box<T> {
    private T value;
    void set(T v) { value = v; }
    T get() { return value; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Java");
        System.out.println(b.get());
    }
}
