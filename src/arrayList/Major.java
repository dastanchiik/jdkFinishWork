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
        int num = 0;
        while (num!=5){
        students.add(new Student(scanner.next(), scanner.nextInt()));
        num++;
        }
        System.out.println("The end");
        System.out.println("\n"+students);
    }
}