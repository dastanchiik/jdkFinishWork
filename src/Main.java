import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты");
        int num = scanner.nextInt();
        while (true){
            if (num == 1) {
                students.add(new Student(scanner.next(), scanner.next(), scanner.nextInt()));
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты");
                num = scanner.nextInt();
            }
            if (num==2){
                System.out.println("Index:");
                int a = scanner.nextInt();
                students.remove(a);
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты");
                num = scanner.nextInt();
            }
            if (num == 3){
                System.out.println("\n"+students);
                System.out.println("1 -> добавить студента" + "\n" + "2 -> удалить студента" + "\n" + "3 -> все студенты");
                num = scanner.nextInt();
            }
        }
    }
}

