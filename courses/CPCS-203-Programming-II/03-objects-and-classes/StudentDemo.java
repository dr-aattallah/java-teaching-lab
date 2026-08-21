class Student {
    private String name;
    Student(String name) { this.name = name; }
    void display() { System.out.println(name); }
}
public class StudentDemo {
    public static void main(String[] args) { new Student("Student One").display(); }
}
