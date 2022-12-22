package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Major {
    public static void main(String[] args) throws MyException {
    method();
    }

    public static void method() throws MyException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students = new ArrayList<>();
        System.out.print("введите сколько студентов хотите добавить:");
        int num = scanner.nextInt();
        int number = 0;
        while (number!=num){
        students.add(new Student(scanner.next(), scanner.nextInt()));
        number++;
        }
        System.out.println("The end");
        System.out.println("\n"+students);
    }
}