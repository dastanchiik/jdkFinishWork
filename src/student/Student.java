package student;

public class Student {

    private String name;
    private String lastName;
    private int age;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student.Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}'+"\n";
    }
}
